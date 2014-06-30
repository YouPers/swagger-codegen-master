/**
 *  Copyright 2013 Wordnik, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.wordnik.swagger.codegen

import com.wordnik.swagger.model._

object BasicObjcGenerator extends BasicObjcGenerator {
  def main(args: Array[String]) = generateClient(args)
}

class BasicObjcGenerator extends BasicGenerator {
  override def defaultIncludes = Set(
    "bool",
    "int",
    "NSString",
    "NSObject", 
    "NSArray",
    "NSNumber")

  override def languageSpecificPrimitives = Set(
    "NSNumber",
    "NSString",
    "NSObject",
    "bool")

  override def reservedWords = Set("void", "char", "short", "int", "void", "char", "short", "int", "long", "float", "double", "signed", "unsigned", "id", "const", "volatile", "in", "out", "inout", "bycopy", "byref", "oneway", "self", "super")

  def foundationClasses = Set(
    "NSNumber",
    "NSObject",
    "NSString")
  
  override def typeMapping = Map(
    "enum" -> "NSString",
    "date" -> "YPDate",
    "Date" -> "YPDate",
    "boolean" -> "NSNumber",
    "string" -> "NSString",
    "integer" -> "NSNumber",
    "int" -> "NSNumber",
    "float" -> "NSNumber",
    "long" -> "NSNumber",
    "double" -> "NSNumber",
    "Array" -> "NSArray",
    "array" -> "NSArray",
    "List" -> "NSArray",
    "object" -> "NSObject")

  override def importMapping = Map(
    "Date" -> "YPDate")

override def toModelFilename(name: String) = "YP" + name

// naming for the models
override def toModelName(name: String) = {
//printf("Name " + name + "\n");
//printf("foundationClasses " + foundationClasses+ "\n");
(typeMapping.keys ++
foundationClasses ++
importMapping.values ++
defaultIncludes ++
languageSpecificPrimitives
).toSet.contains(name) match {
case true => name(0).toUpper + name.substring(1)
case _ => {
"YP" + name(0).toUpper + name.substring(1)
}
}
}

// objective c doesn't like variables starting with "new"
override def toVarName(name: String): String = {
val paramName = name.replaceAll("[^a-zA-Z0-9_]","")
if(paramName.startsWith("new") || reservedWords.contains(paramName)) {
escapeReservedWord(paramName)
}
else paramName
}

// naming for the apis
override def toApiName(name: String) = "YP" + name(0).toUpper + name.substring(1) + "Api"

// location of templates
override def templateDir = "objc"

  // template used for models
  modelTemplateFiles += "model-header.mustache" -> ".h"
  modelTemplateFiles += "model-body.mustache" -> ".m"

  // template used for apis
  apiTemplateFiles += "api-header.mustache" -> ".h"
  apiTemplateFiles += "api-body.mustache" -> ".m"

  // package for models
  override def invokerPackage: Option[String] = None

  // package for models
  override def modelPackage: Option[String] = None

  // package for api classes
  override def apiPackage: Option[String] = None

  // response classes
  override def processResponseClass(responseClass: String): Option[String] = {
    typeMapping.contains(responseClass) match {
      case true => Some(typeMapping(responseClass))
      case false => {
        responseClass match {
          case "void" => None
          case e: String => {
            if(responseClass.toLowerCase.startsWith("array") || responseClass.toLowerCase.startsWith("list"))
              Some("NSArray")
            else
              Some(toModelName(responseClass))
          }
        }
      }
    }
  }

  override def processApiMap(m: Map[String, AnyRef]): Map[String, AnyRef] = {
    val mutable = scala.collection.mutable.Map() ++ m
    mutable += "newline" -> "\n"
    //println("LOG: mutable " + mutable + "\n");
    mutable.map(k => {
      k._1 match {
        case e: String if (e == "allParams") => {
          val sp = (mutable(e)).asInstanceOf[List[_]]
          sp.size match {
            case i: Int if(i > 0) => mutable += "hasParams" -> "true"
            case _ =>
          }
        }
        case _ =>
      }
    })
    mutable.toMap
  }

  override def processResponseDeclaration(responseClass: String): Option[String] = {
    processResponseClass(responseClass) match {
      case Some("void") => Some("void")
      case Some(e) => Some(e + "*")
      case _ => Some(responseClass)
    }
  }

  override def toDeclaredType(dt: String): String = {
    val declaredType = dt.indexOf("[") match {
      case -1 => dt
      case n: Int => "NSArray"
    }
    val t = typeMapping.getOrElse(declaredType, declaredType)

    (languageSpecificPrimitives.contains(t) && !foundationClasses.contains(t)) match {
      case true => toModelName(t)
      case _ => toModelName(t) + "*" // needs pointer
    }
  }

  override def toDeclaration(obj: ModelProperty) = {
    var declaredType = toDeclaredType(obj.`type`)
    declaredType.toLowerCase match {
      case "list" => {
        declaredType = "array"
      }
      case e: String => e
    }

    val defaultValue = toDefaultValue(declaredType, obj)
    declaredType match {
      case "array" => {
        val inner = {
          obj.items match {
            case Some(items) => {
              if(items.ref != null) 
                items.ref
              else
                items.`type`
            }
            case _ => {
              println("failed on " + obj)
              throw new Exception("no inner type defined")
            }
          }
        }
        "NSArray"
      }
      case "set" => {
        val inner = {
          obj.items match {
            case Some(items) => items.ref.getOrElse(items.`type`)
            case _ => {
              println("failed on " + obj)
              throw new Exception("no inner type defined")
            }
          }
        }
        "NSArray"
      }
      case _ =>
    }
    (declaredType, defaultValue)
  }

  override def escapeReservedWord(word: String) = "_" + word

  override def toDefaultValue(properCase: String, obj: ModelProperty) = {
    properCase match {
      case "boolean" => "false"
      case "int" => "0"
      case "long" => "0L"
      case "float" => "0.0f"
      case "double" => "0.0"
      case "List" => {
        val inner = {
          obj.items match {
            case Some(items) => {
              if(items.ref != null) 
                items.ref
              else
                items.`type`
            }
            case _ => {
              println("failed on " + properCase + ", " + obj)
              throw new Exception("no inner type defined")
            }
          }
        }
        "new ArrayList<" + inner + ">" + "()"
      }
      case _ => "null"
    }
  }
}
