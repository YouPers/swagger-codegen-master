package com.wordnik.client.api;

import com.wordnik.client.common.ApiException;
import com.wordnik.client.common.ApiInvoker;
import com.wordnik.client.model.WordListWord;
import com.wordnik.client.model.WordList;
import com.wordnik.client.model.StringValue;
import java.util.*;

public class WordListApi {
  String basePath = "http://api.wordnik.com/v4";
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

  public void updateWordList (String permalink, WordList body, String auth_token) throws ApiException {
    // verify required params are set
    if(permalink == null || auth_token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/wordList.{format}/{permalink}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    headerParams.put("auth_token", auth_token);
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
  public void deleteWordList (String permalink, String auth_token) throws ApiException {
    // verify required params are set
    if(permalink == null || auth_token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/wordList.{format}/{permalink}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    headerParams.put("auth_token", auth_token);
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
  public WordList getWordListByPermalink (String permalink, String auth_token) throws ApiException {
    // verify required params are set
    if(permalink == null || auth_token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/wordList.{format}/{permalink}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    headerParams.put("auth_token", auth_token);
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (WordList) ApiInvoker.deserialize(response, "", WordList.class);
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
  public void addWordsToWordList (String permalink, List<StringValue> body, String auth_token) throws ApiException {
    // verify required params are set
    if(permalink == null || auth_token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/wordList.{format}/{permalink}/words".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    headerParams.put("auth_token", auth_token);
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, contentType);
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
  public List<WordListWord> getWordListWords (String permalink, String auth_token, String sortBy, String sortOrder, Integer skip, Integer limit) throws ApiException {
    // verify required params are set
    if(permalink == null || auth_token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/wordList.{format}/{permalink}/words".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(sortBy)))
      queryParams.put("sortBy", String.valueOf(sortBy));
    if(!"null".equals(String.valueOf(sortOrder)))
      queryParams.put("sortOrder", String.valueOf(sortOrder));
    if(!"null".equals(String.valueOf(skip)))
      queryParams.put("skip", String.valueOf(skip));
    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    headerParams.put("auth_token", auth_token);
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<WordListWord>) ApiInvoker.deserialize(response, "List", WordListWord.class);
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
  public void deleteWordsFromWordList (String permalink, List<StringValue> body, String auth_token) throws ApiException {
    // verify required params are set
    if(permalink == null || auth_token == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/wordList.{format}/{permalink}/deleteWords".replaceAll("\\{format\\}","json").replaceAll("\\{" + "permalink" + "\\}", apiInvoker.escapeString(permalink.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    headerParams.put("auth_token", auth_token);
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, body, headerParams, contentType);
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

