package com.youpers.utils;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;

public class JsonUtil {
  public static ObjectMapper mapper;

  static {
    mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
  }

  public static ObjectMapper getJsonMapper() {
    return mapper;
  }
}

