package com.youpers.api;

import com.youpers.client.ApiException;
import com.youpers.client.ApiInvoker;
import com.youpers.model.Assessment;
import com.youpers.model.AssessmentResultAnswer;
import com.youpers.model.AssessmentResult;
import java.util.*;

public class AssessmentsApi {
  String basePath = "http://localhost:8000";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  public void putAssessment (String id, AssessmentResult body) throws ApiException {
    // verify required params are set
    if(id == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/assessments/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  public AssessmentResult postAssessmentResult (String assessmentId, AssessmentResult body) throws ApiException {
    // verify required params are set
    if(assessmentId == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/assessments/{assessmentId}/results".replaceAll("\\{format\\}","json").replaceAll("\\{" + "assessmentId" + "\\}", apiInvoker.escapeString(assessmentId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, contentType);
      if(response != null){
        return (AssessmentResult) ApiInvoker.deserialize(response, "", AssessmentResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void assessmentResultAnswerPut (String assessmentId, AssessmentResultAnswer body, String questionId) throws ApiException {
    // verify required params are set
    if(assessmentId == null || body == null || questionId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/assessments/{assessmentId}/answers/{questionId}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "assessmentId" + "\\}", apiInvoker.escapeString(assessmentId.toString())).replaceAll("\\{" + "questionId" + "\\}", apiInvoker.escapeString(questionId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  public List<AssessmentResult> getNewestAssessmentResult (String assessmentId, String populate, String populatedeep) throws ApiException {
    // verify required params are set
    if(assessmentId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/assessments/{assessmentId}/results/newest".replaceAll("\\{format\\}","json").replaceAll("\\{" + "assessmentId" + "\\}", apiInvoker.escapeString(assessmentId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(populate)))
      queryParams.put("populate", String.valueOf(populate));
    if(!"null".equals(String.valueOf(populatedeep)))
      queryParams.put("populatedeep", String.valueOf(populatedeep));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<AssessmentResult>) ApiInvoker.deserialize(response, "Array", AssessmentResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public List<AssessmentResult> getAssessmentResults (String assessmentId, String populate, String populatedeep) throws ApiException {
    // verify required params are set
    if(assessmentId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/assessments/{assessmentId}/results".replaceAll("\\{format\\}","json").replaceAll("\\{" + "assessmentId" + "\\}", apiInvoker.escapeString(assessmentId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(populate)))
      queryParams.put("populate", String.valueOf(populate));
    if(!"null".equals(String.valueOf(populatedeep)))
      queryParams.put("populatedeep", String.valueOf(populatedeep));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<AssessmentResult>) ApiInvoker.deserialize(response, "Array", AssessmentResult.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteAssessmentResults (String assessmentId) throws ApiException {
    // verify required params are set
    if(assessmentId == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/assessments/{assessmentId}/results".replaceAll("\\{format\\}","json").replaceAll("\\{" + "assessmentId" + "\\}", apiInvoker.escapeString(assessmentId.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteAssessmentResult (String assessmentId, String id) throws ApiException {
    // verify required params are set
    if(assessmentId == null || id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/assessments/{assessmentId}/results/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "assessmentId" + "\\}", apiInvoker.escapeString(assessmentId.toString())).replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  public List<Assessment> getAssessments (String sort, Integer limit, String filter, String populate, String populatedeep) throws ApiException {
    // create path and map variables
    String path = "/assessments".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(sort)))
      queryParams.put("sort", String.valueOf(sort));
    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    if(!"null".equals(String.valueOf(filter)))
      queryParams.put("filter", String.valueOf(filter));
    if(!"null".equals(String.valueOf(populate)))
      queryParams.put("populate", String.valueOf(populate));
    if(!"null".equals(String.valueOf(populatedeep)))
      queryParams.put("populatedeep", String.valueOf(populatedeep));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<Assessment>) ApiInvoker.deserialize(response, "Array", Assessment.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public Assessment getAssessment (String id, String populate, String populatedeep) throws ApiException {
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/assessments/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(populate)))
      queryParams.put("populate", String.valueOf(populate));
    if(!"null".equals(String.valueOf(populatedeep)))
      queryParams.put("populatedeep", String.valueOf(populatedeep));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (Assessment) ApiInvoker.deserialize(response, "", Assessment.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteAssessments () throws ApiException {
    // create path and map variables
    String path = "/assessments".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, null, headerParams, contentType);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
        return ;
      }
      else {
        throw ex;
      }
    }
  }
  }

