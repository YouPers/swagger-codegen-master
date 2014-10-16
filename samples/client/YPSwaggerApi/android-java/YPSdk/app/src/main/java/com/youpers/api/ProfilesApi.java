package com.youpers.api;

import com.youpers.client.ApiException;
import com.youpers.client.ApiInvoker;
import com.youpers.model.Profile;
import java.util.*;

public class ProfilesApi {
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

  public List<Profile> getProfiles (String sort, String populate, String populatedeep) throws ApiException {
    // create path and map variables
    String path = "/profiles".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(sort)))
      queryParams.put("sort", String.valueOf(sort));
    if(!"null".equals(String.valueOf(populate)))
      queryParams.put("populate", String.valueOf(populate));
    if(!"null".equals(String.valueOf(populatedeep)))
      queryParams.put("populatedeep", String.valueOf(populatedeep));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<Profile>) ApiInvoker.deserialize(response, "Array", Profile.class);
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
  public Profile putUserProfileById (String id, Profile body) throws ApiException {
    // verify required params are set
    if(id == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/profiles/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, body, headerParams, contentType);
      if(response != null){
        return (Profile) ApiInvoker.deserialize(response, "", Profile.class);
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

