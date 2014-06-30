package com.wordnik.client.api;

import com.wordnik.client.common.ApiException;
import com.wordnik.client.common.ApiInvoker;
import com.wordnik.client.model.FrequencySummary;
import com.wordnik.client.model.Bigram;
import com.wordnik.client.model.WordObject;
import com.wordnik.client.model.ExampleSearchResults;
import com.wordnik.client.model.Example;
import com.wordnik.client.model.ScrabbleScoreResult;
import com.wordnik.client.model.TextPron;
import com.wordnik.client.model.Syllable;
import com.wordnik.client.model.Related;
import com.wordnik.client.model.Definition;
import com.wordnik.client.model.AudioFile;
import java.util.*;

public class WordApi {
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

  public ExampleSearchResults getExamples (String word, String includeDuplicates, String useCanonical, Integer skip, Integer limit) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/examples".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(includeDuplicates)))
      queryParams.put("includeDuplicates", String.valueOf(includeDuplicates));
    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    if(!"null".equals(String.valueOf(skip)))
      queryParams.put("skip", String.valueOf(skip));
    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (ExampleSearchResults) ApiInvoker.deserialize(response, "", ExampleSearchResults.class);
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
  public WordObject getWord (String word, String useCanonical, String includeSuggestions) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    if(!"null".equals(String.valueOf(includeSuggestions)))
      queryParams.put("includeSuggestions", String.valueOf(includeSuggestions));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (WordObject) ApiInvoker.deserialize(response, "", WordObject.class);
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
  public List<Definition> getDefinitions (String word, String partOfSpeech, String sourceDictionaries, Integer limit, String includeRelated, String useCanonical, String includeTags) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/definitions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    if(!"null".equals(String.valueOf(partOfSpeech)))
      queryParams.put("partOfSpeech", String.valueOf(partOfSpeech));
    if(!"null".equals(String.valueOf(includeRelated)))
      queryParams.put("includeRelated", String.valueOf(includeRelated));
    if(!"null".equals(String.valueOf(sourceDictionaries)))
      queryParams.put("sourceDictionaries", String.valueOf(sourceDictionaries));
    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    if(!"null".equals(String.valueOf(includeTags)))
      queryParams.put("includeTags", String.valueOf(includeTags));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<Definition>) ApiInvoker.deserialize(response, "List", Definition.class);
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
  public Example getTopExample (String word, String useCanonical) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/topExample".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (Example) ApiInvoker.deserialize(response, "", Example.class);
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
  public List<Related> getRelatedWords (String word, String relationshipTypes, String useCanonical, Integer limitPerRelationshipType) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/relatedWords".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    if(!"null".equals(String.valueOf(relationshipTypes)))
      queryParams.put("relationshipTypes", String.valueOf(relationshipTypes));
    if(!"null".equals(String.valueOf(limitPerRelationshipType)))
      queryParams.put("limitPerRelationshipType", String.valueOf(limitPerRelationshipType));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<Related>) ApiInvoker.deserialize(response, "List", Related.class);
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
  public List<TextPron> getTextPronunciations (String word, String sourceDictionary, String typeFormat, String useCanonical, Integer limit) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/pronunciations".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    if(!"null".equals(String.valueOf(sourceDictionary)))
      queryParams.put("sourceDictionary", String.valueOf(sourceDictionary));
    if(!"null".equals(String.valueOf(typeFormat)))
      queryParams.put("typeFormat", String.valueOf(typeFormat));
    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<TextPron>) ApiInvoker.deserialize(response, "List", TextPron.class);
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
  public List<Syllable> getHyphenation (String word, String sourceDictionary, String useCanonical, Integer limit) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/hyphenation".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    if(!"null".equals(String.valueOf(sourceDictionary)))
      queryParams.put("sourceDictionary", String.valueOf(sourceDictionary));
    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<Syllable>) ApiInvoker.deserialize(response, "List", Syllable.class);
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
  public FrequencySummary getWordFrequency (String word, String useCanonical, Integer startYear, Integer endYear) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/frequency".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    if(!"null".equals(String.valueOf(startYear)))
      queryParams.put("startYear", String.valueOf(startYear));
    if(!"null".equals(String.valueOf(endYear)))
      queryParams.put("endYear", String.valueOf(endYear));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (FrequencySummary) ApiInvoker.deserialize(response, "", FrequencySummary.class);
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
  public List<Bigram> getPhrases (String word, Integer limit, Integer wlmi, String useCanonical) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/phrases".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    if(!"null".equals(String.valueOf(wlmi)))
      queryParams.put("wlmi", String.valueOf(wlmi));
    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<Bigram>) ApiInvoker.deserialize(response, "List", Bigram.class);
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
  public List<String> getEtymologies (String word, String useCanonical) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/etymologies".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<String>) ApiInvoker.deserialize(response, "List", String.class);
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
  public List<AudioFile> getAudio (String word, String useCanonical, Integer limit) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/audio".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(useCanonical)))
      queryParams.put("useCanonical", String.valueOf(useCanonical));
    if(!"null".equals(String.valueOf(limit)))
      queryParams.put("limit", String.valueOf(limit));
    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (List<AudioFile>) ApiInvoker.deserialize(response, "List", AudioFile.class);
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
  public ScrabbleScoreResult getScrabbleScore (String word) throws ApiException {
    // verify required params are set
    if(word == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/word.{format}/{word}/scrabbleScore".replaceAll("\\{format\\}","json").replaceAll("\\{" + "word" + "\\}", apiInvoker.escapeString(word.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    String contentType = "application/json";

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, headerParams, contentType);
      if(response != null){
        return (ScrabbleScoreResult) ApiInvoker.deserialize(response, "", ScrabbleScoreResult.class);
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

