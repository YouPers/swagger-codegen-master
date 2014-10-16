package com.youpers.api;

import com.youpers.client.ApiException;
import com.youpers.client.ApiInvoker;
import com.youpers.model.SocialInteraction;
import java.util.*;

public class SocialInteractionsApi {
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

  public SocialInteraction getSocialInteractionById (String id, String populate) throws ApiException {
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/socialInteractions/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(populate)))
      queryParams.put("populate", String.valueOf(populate));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (SocialInteraction) ApiInvoker.deserialize(response, "", SocialInteraction.class);
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
  public List<SocialInteraction> getSocialInteractions (String sort, Integer limit, String filter, String populate, String populatedeep, Boolean dismissed, Boolean rejected, Boolean authored, String targetId, String authorType, String discriminators, String refDocId, String mode) throws ApiException {
    // create path and map variables
    String path = "/socialInteractions".replaceAll("\\{format\\}","json");

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
    if(!"null".equals(String.valueOf(dismissed)))
      queryParams.put("dismissed", String.valueOf(dismissed));
    if(!"null".equals(String.valueOf(rejected)))
      queryParams.put("rejected", String.valueOf(rejected));
    if(!"null".equals(String.valueOf(authored)))
      queryParams.put("authored", String.valueOf(authored));
    if(!"null".equals(String.valueOf(targetId)))
      queryParams.put("targetId", String.valueOf(targetId));
    if(!"null".equals(String.valueOf(authorType)))
      queryParams.put("authorType", String.valueOf(authorType));
    if(!"null".equals(String.valueOf(discriminators)))
      queryParams.put("discriminators", String.valueOf(discriminators));
    if(!"null".equals(String.valueOf(refDocId)))
      queryParams.put("refDocId", String.valueOf(refDocId));
    if(!"null".equals(String.valueOf(mode)))
      queryParams.put("mode", String.valueOf(mode));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<SocialInteraction>) ApiInvoker.deserialize(response, "Array", SocialInteraction.class);
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
  public void deleteSocialInteraction (String id, String mode, String reason) throws ApiException {
    // verify required params are set
    if(id == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/socialInteractions/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(mode)))
      queryParams.put("mode", String.valueOf(mode));
    if(!"null".equals(String.valueOf(reason)))
      queryParams.put("reason", String.valueOf(reason));
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

