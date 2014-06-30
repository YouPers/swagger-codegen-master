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

import java.io.File

object BasicRubyGenerator extends BasicRubyGenerator {
  def main(args: Array[String]) = generateClient(args)
}

class BasicRubyGenerator extends BasicGenerator {

  override def apiPackage = Some("lib")

  // location of templates
  override def templateDir = "ruby"

  // template used for models
  modelTemplateFiles += "model.mustache" -> ".rb"

  // template used for models
  apiTemplateFiles += "api.mustache" -> ".rb"

  // where to write generated code
  override def destinationDir = "generated-code/ruby"

  // file suffix
  override def fileSuffix = ".rb"

  // package for models
  override def modelPackage = Some("models")

  // response classes
  override def processResponseClass(responseClass: String): Option[String] = {
    responseClass match {
      case "void" => None
      case e: String => Some(e)
    }
  }

  override def toApiName(name: String) = {
    var fixedName = name.replaceAll("(\\{|\\})","")
    fixedName(0).toUpper + fixedName.substring(1) + "_api"
  }

  override def toModelFilename(name: String) = name.toLowerCase.replaceAll("(\\{|\\})","")
  override def toApiFilename(name: String) = name.toLowerCase.replaceAll("(\\{|\\})","") + "_api"
  override def toVarName(name: String): String = toUnderscore(name)

  override def toMethodName(name: String): String = toUnderscore(name)

  def toUnderscore(name: String): String = {
    val sb = new StringBuilder
    for ((char) <- super.toVarName(name)) {
      if (char.isUpper) sb.append("_").append(char.toLower)
      else sb.append(char)
    }
    sb.toString
  }

  override def toDeclaration(obj: ModelProperty) = {
    var dataType = obj.`type`(0).toUpper + obj.`type`.substring(1)

    dataType match {
      case "Array" => dataType = "List"
      case e: String => e
    }

    val defaultValue = toDefaultValue(dataType, obj)
    dataType match {
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
              println("failed on " + dataType + ", " + obj)
              throw new Exception("no inner type defined")
            }
          }
        }
        dataType = "java.util.List[" + inner + "]"
      }
      case _ =>
    }
    (dataType, defaultValue)
  }

  // supporting classes
  override def supportingFiles = List(
    ("monkey.mustache", destinationDir + File.separator + apiPackage.get, "monkey.rb"),
    ("swagger.mustache", destinationDir + File.separator + apiPackage.get, "swagger.rb"),
    ("swagger" + File.separator + "configuration.mustache", destinationDir + File.separator + apiPackage.get, "swagger" + File.separator + "configuration.rb"),
    ("swagger" + File.separator + "response.mustache", destinationDir + File.separator + apiPackage.get, "swagger" + File.separator + "response.rb"),
    ("swagger" + File.separator + "version.mustache", destinationDir + File.separator + apiPackage.get, "swagger" + File.separator + "version.rb"),
    ("swagger" + File.separator + "request.mustache", destinationDir + File.separator + apiPackage.get, "swagger" + File.separator + "request.rb"))
}
