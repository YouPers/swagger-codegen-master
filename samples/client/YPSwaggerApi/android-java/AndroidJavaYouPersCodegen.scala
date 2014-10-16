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

import com.wordnik.swagger.codegen.BasicAndroidJavaGenerator

object AndroidJavaYouPersCodegen extends BasicAndroidJavaGenerator {
  def main(args: Array[String]) = generateClient(args)

  // location of templates
  override def templateDir = "src/main/resources/android-java"

  // where to write generated code
  override def destinationDir = "samples/client/YPSwaggerApi/android-java/src/main/java"

  // package for api invoker, error files
  override def invokerPackage = Some("com.youpers.client")

  // package for models
  override def modelPackage = Some("com.youpers.model")

  // package for utils
  def utilsPackage = Some("com.youpers.utils")

  // package for api classes
  override def apiPackage = Some("com.youpers.api")

  additionalParams ++= Map(
    "artifactId" -> "swagger-youpers",
    "artifactVersion" -> "1.0.0",
    "groupId" -> "com.wordnik")

  // supporting classes
  override def supportingFiles = List(
    ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiInvoker.java"),
    ("jsonUtil.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "JsonUtil.java"),
    ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiException.java"),
    ("httpPatch.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "HttpPatch.java"),
    ("pom.mustache", "samples/client/YPSwaggerApi/android-java", "pom.xml"),
    ("ObjectYP.java", destinationDir + java.io.File.separator + modelPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ObjectYP.java"),
    ("ObjectId.java", destinationDir + java.io.File.separator + modelPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ObjectId.java"),
    ("AsyncTaskResult.java", destinationDir + java.io.File.separator + utilsPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "AsyncTaskResult.java"),
    ("Credentials.java", destinationDir + java.io.File.separator + utilsPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "Credentials.java"),
    ("JsonUtil.java", destinationDir + java.io.File.separator + utilsPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "JsonUtil.java"),
    ("NetworkUtils.java", destinationDir + java.io.File.separator + utilsPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "NetworkUtils.java"),
    ("SecurePreferences.java", destinationDir + java.io.File.separator + utilsPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "SecurePreferences.java")
  )
}
