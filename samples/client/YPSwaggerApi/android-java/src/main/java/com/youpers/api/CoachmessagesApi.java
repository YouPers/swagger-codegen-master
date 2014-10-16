package com.youpers.api;

import com.youpers.client.ApiException;
import com.youpers.client.ApiInvoker;
import java.util.*;

public class CoachmessagesApi {
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

  public List<String> coachMessagesGet (String uistate, Boolean debug) throws ApiException {
    // verify required params are set
    if(uistate == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/coachmessages".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(uistate)))
      queryParams.put("uistate", String.valueOf(uistate));
    if(!"null".equals(String.valueOf(debug)))
      queryParams.put("debug", String.valueOf(debug));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<String>) ApiInvoker.deserialize(response, "Array", String.class);
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

