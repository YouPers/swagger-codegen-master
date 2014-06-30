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

object BasicJavaGenerator extends BasicJavaGenerator {
  def main(args: Array[String]) = generateClient(args)
}

class BasicJavaGenerator extends BasicGenerator {
  override def defaultIncludes = Set(
    "double",
    "int",
    "long",
    "short",
    "char",
    "float",
    "String",
    "boolean",
    "Boolean",
    "Double",
    "Integer",
    "Long",
    "Float")

  /**
   * We are using java objects instead of primitives to avoid showing default
   * primitive values when the API returns missing data.  For instance, having a
   * {"count":0} != count is unknown.  You can change this to use primitives if you
   * desire, but update the default values as well or they'll be set to null in 
   * variable declarations.
   */
  override def typeMapping = Map(
    "Array" -> "List",
    "array" -> "List",
    "List" -> "List",
    "boolean" -> "Boolean",
    "string" -> "String",
    "int" -> "Integer",
    "float" -> "Float",
    "long" -> "Long",
    "short" -> "Short",
    "char" -> "String",
    "double" -> "Double",
    "object" -> "Object",
    "integer" -> "Integer")

  // location of templates
  override def templateDir = "Java"

  // where to write generated code
  override def destinationDir = "generated-code/java/src/main/java"

  // template used for models
  modelTemplateFiles += "model.mustache" -> ".java"

  // template used for models
  apiTemplateFiles += "api.mustache" -> ".java"

  override def reservedWords = Set("abstract", "continue", "for", "new", "switch", "assert", 
      "default", "if", "package", "synchronized", "boolean", "do", "goto", "private", 
      "this", "break", "double", "implements", "protected", "throw", "byte", "else", 
      "import", "public", "throws", "case", "enum", "instanceof", "return", "transient", 
      "catch", "extends", "int", "short", "try", "char", "final", "interface", "static", 
      "void", "class", "finally", "long", "strictfp", "volatile", "const", "float", 
      "native", "super", "while")

  // import/require statements for specific datatypes
  override def importMapping = Map(
    "File" -> "java.io.File",
    "Date" -> "java.util.Date",
    "Array" -> "java.util.*",
    "ArrayList" -> "java.util.*",
    "List" -> "java.util.*",
    "DateTime" -> "org.joda.time.*",
    "LocalDateTime" -> "org.joda.time.*",
    "LocalDate" -> "org.joda.time.*",
    "LocalTime" -> "org.joda.time.*"
  )

  // package for models
  override def modelPackage = Some("com.wordnik.client.model")

  // package for api classes
  override def apiPackage = Some("com.wordnik.client.api")

  // file suffix
  override def fileSuffix = ".java"

  override def toVarName(name: String): String = {
    val paramName = name.replaceAll("[^a-zA-Z0-9_]","")
    super.toVarName(paramName)
  }

  // response classes
  override def processResponseClass(responseClass: String): Option[String] = {
    responseClass match {
      case "void" => None
      case e: String => Some(typeMapping.getOrElse(e, e.replaceAll("\\[", "<").replaceAll("\\]", ">")))
    }
  }

  override def processResponseDeclaration(responseClass: String): Option[String] = {
    responseClass match {
      case "void" => None
      case e: String => {
        val ComplexTypeMatcher = "(.*)\\[(.*)\\].*".r
        val t = e match {
          case ComplexTypeMatcher(container, inner) => {
            e.replaceAll(container, typeMapping.getOrElse(container, container))
          }
          case _ => e
        }
        Some(typeMapping.getOrElse(t, t.replaceAll("\\[", "<").replaceAll("\\]", ">")))
      }
    }
  }

  override def toDeclaredType(dt: String): String = {
    val declaredType = dt.indexOf("[") match {
      case -1 => dt
      case n: Int => {
        if (dt.substring(0, n) == "Array")
          "List" + dt.substring(n).replaceAll("\\[", "<").replaceAll("\\]", ">")
        else if (dt.substring(0, n) == "Set")
          "Set" + dt.substring(n).replaceAll("\\[", "<").replaceAll("\\]", ">")
        else dt.replaceAll("\\[", "<").replaceAll("\\]", ">")
      }
    }
    typeMapping.getOrElse(declaredType, declaredType)
  }

  override def toDeclaration(obj: ModelProperty) = {
    var declaredType = toDeclaredType(obj.`type`)
    declaredType match {
      case "Array" => declaredType = "List"
      case e: String => e
    }

    val defaultValue = toDefaultValue(declaredType, obj)
    declaredType match {
      case "List" => {
        val inner = {
          obj.items match {
            case Some(items) => items.ref.getOrElse(items.`type`)
            case _ => {
              println("failed on " + declaredType + ", " + obj)
              throw new Exception("no inner type defined")
            }
          }
        }
        declaredType += "<" + toDeclaredType(inner) + ">"
      }
      case "Set" => {
        val inner = {
          obj.items match {
            case Some(items) => items.ref.getOrElse(items.`type`)
            case _ => {
              println("failed on " + declaredType + ", " + obj)
              throw new Exception("no inner type defined")
            }
          }
        }
        declaredType += "<" + toDeclaredType(inner) + ">"
      }
      case _ =>
    }
    (declaredType, defaultValue)
  }

  /**
   * you should override these params for generating the pom.xml and processing
   * additional params
   **/
  additionalParams ++= Map(
    "artifactId" -> "java-client", 
    "artifactVersion" -> "1.0.0",
    "groupId" -> "com.wordnik")

  /**
   * we are defaulting to null values since the codegen uses java objects instead of primitives
   * If you change to primitives, you can put in the appropriate values (0.0f, etc).
   */
  override def toDefaultValue(dataType: String, obj: ModelProperty) = {
    dataType match {
      case "Boolean" => "null"
      case "Integer" => "null"
      case "Long" => "null"
      case "Short" => "null"
      case "Float" => "null"
      case "Double" => "null"
      case "List" => {
        val inner = {
          obj.items match {
            case Some(items) => items.ref.getOrElse(items.`type`)
            case _ => {
              println("failed on " + dataType + ", " + obj)
              throw new Exception("no inner type defined")
            }
          }
        }
        "new ArrayList<" + toDeclaredType(inner) + ">" + "()"
      }
      case _ => "null"
    }
  }

  override def escapeReservedWord(word: String) = {
    if (reservedWords.contains(word)) 
      throw new Exception("reserved word " + "\"" + word + "\" not allowed")
    else word
  }

  // supporting classes
  override def supportingFiles =
    List(
      ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiInvoker.java"),
      ("JsonUtil.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "JsonUtil.java"),
      ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiException.java"),
      ("pom.mustache", "generated-code/java", "pom.xml"))
}
