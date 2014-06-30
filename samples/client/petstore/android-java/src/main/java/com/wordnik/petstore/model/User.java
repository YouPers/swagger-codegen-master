package com.wordnik.petstore.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
  @JsonProperty("id")
  private Long id = null;
  @JsonProperty("firstName")
  private String firstName = null;
  @JsonProperty("username")
  private String username = null;
  @JsonProperty("lastName")
  private String lastName = null;
  @JsonProperty("email")
  private String email = null;
  @JsonProperty("password")
  private String password = null;
  @JsonProperty("phone")
  private String phone = null;
  /* User Status */
  @JsonProperty("userStatus")
  private Integer userStatus = null;
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getUserStatus() {
    return userStatus;
  }
  public void setUserStatus(Integer userStatus) {
    this.userStatus = userStatus;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  userStatus: ").append(userStatus).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

