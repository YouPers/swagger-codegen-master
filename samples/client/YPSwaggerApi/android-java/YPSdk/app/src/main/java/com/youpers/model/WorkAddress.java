package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

public class WorkAddress extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("street")
  private String street = null;
  @JsonProperty("houseNumber")
  private String houseNumber = null;
  @JsonProperty("zipCode")
  private Long zipCode = null;
  @JsonProperty("city")
  private String city = null;
  @JsonProperty("country")
  private String country = null;
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
  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
      this.houseNumber = houseNumber;
  }
  public Long getZipCode() {
    return zipCode;
  }

  public void setZipCode(Long zipCode) {
      this.zipCode = zipCode;
  }
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
      this.city = city;
  }
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
      this.country = country;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkAddress {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  street: ").append(street).append("\n");
    sb.append("  houseNumber: ").append(houseNumber).append("\n");
    sb.append("  zipCode: ").append(zipCode).append("\n");
    sb.append("  city: ").append(city).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

