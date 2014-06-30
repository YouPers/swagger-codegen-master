package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

public class Contact extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("firstname")
  private String firstname = null;
  @JsonProperty("lastname")
  private String lastname = null;
  @JsonProperty("position")
  private String position = null;
  @JsonProperty("email")
  private String email = null;
  @JsonProperty("phone")
  private String phone = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
      this.firstname = firstname;
  }
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
      this.lastname = lastname;
  }
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
      this.position = position;
  }
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
      this.phone = phone;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  firstname: ").append(firstname).append("\n");
    sb.append("  lastname: ").append(lastname).append("\n");
    sb.append("  position: ").append(position).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

