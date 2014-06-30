package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

public class Address extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("street")
  private String street = null;
  @JsonProperty("zipCode")
  private String zipCode = null;
  @JsonProperty("city")
  private String city = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
      this.street = street;
  }
  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
      this.zipCode = zipCode;
  }
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
      this.city = city;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  street: ").append(street).append("\n");
    sb.append("  zipCode: ").append(zipCode).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

