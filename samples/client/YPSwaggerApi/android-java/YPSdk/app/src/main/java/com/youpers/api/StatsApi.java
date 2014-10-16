package com.youpers.api;

import com.youpers.client.ApiException;
import com.youpers.client.ApiInvoker;
import java.util.*;

public class StatsApi {
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

  public String getStats (String type, String scopeType, String scopeId, String range) throws ApiException {
    // verify required params are set
    if(type == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/stats".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(type)))
      queryParams.put("type", String.valueOf(type));
    if(!"null".equals(String.valueOf(scopeType)))
      queryParams.put("scopeType", String.valueOf(scopeType));
    if(!"null".equals(String.valueOf(scopeId)))
      queryParams.put("scopeId", String.valueOf(scopeId));
    if(!"null".equals(String.valueOf(range)))
      queryParams.put("range", String.valueOf(range));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (String) ApiInvoker.deserialize(response, "", String.class);
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
  }

