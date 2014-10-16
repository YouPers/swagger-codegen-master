package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.Profile;
import com.youpers.model.Campaign;
public class User extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("firstname")
  private String firstname = null;
  @JsonProperty("lastname")
  private String lastname = null;
  @JsonProperty("fullname")
  private String fullname = null;
  @JsonProperty("accessToken")
  private String accessToken = null;
  @JsonProperty("refreshToken")
  private String refreshToken = null;
  @JsonProperty("provider")
  private String provider = null;
  @JsonProperty("providerId")
  private String providerId = null;
  @JsonProperty("emails")
  private List<String> emails = new ArrayList<String>();
  @JsonProperty("photos")
  private List<String> photos = new ArrayList<String>();
  @JsonProperty("email")
  private String email = null;
  @JsonProperty("avatar")
  private String avatar = null;
  @JsonProperty("emailValidatedFlag")
  private Boolean emailValidatedFlag = null;
  @JsonProperty("username")
  private String username = null;
  @JsonProperty("roles")
  private List<String> roles = new ArrayList<String>();
  @JsonProperty("hashed_password")
  private String hashed_password = null;
  @JsonProperty("tempPasswordFlag")
  private Boolean tempPasswordFlag = null;
  @JsonProperty("campaign")
  private Campaign campaign = null;
  @JsonProperty("profile")
  private Profile profile = null;
  @JsonProperty("updated")
  private Date updated = null;
  @JsonProperty("created")
  private Date created = null;
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
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
      this.fullname = fullname;
  }
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
  }
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
  }
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
      this.provider = provider;
  }
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
      this.providerId = providerId;
  }
  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
      this.emails = emails;
  }
  public List<String> getPhotos() {
    return photos;
  }

  public void setPhotos(List<String> photos) {
      this.photos = photos;
  }
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
      this.email = email;
  }
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
      this.avatar = avatar;
  }
  public Boolean getEmailValidatedFlag() {
    return emailValidatedFlag;
  }

  public void setEmailValidatedFlag(Boolean emailValidatedFlag) {
      this.emailValidatedFlag = emailValidatedFlag;
  }
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
      this.username = username;
  }
  public List<String> getRoles() {
    return roles;
  }

  public void setRoles(List<String> roles) {
      this.roles = roles;
  }
  public String getHashed_password() {
    return hashed_password;
  }

  public void setHashed_password(String hashed_password) {
      this.hashed_password = hashed_password;
  }
  public Boolean getTempPasswordFlag() {
    return tempPasswordFlag;
  }

  public void setTempPasswordFlag(Boolean tempPasswordFlag) {
      this.tempPasswordFlag = tempPasswordFlag;
  }
  public Campaign getCampaign() {
    return campaign;
  }

  public void setCampaign(Object campaign)
  {
      if(campaign instanceof String)
      {
          String strId;
          strId = (String)campaign;

          Campaign obj = new Campaign();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.campaign = obj;
      }
      else
      {
          Campaign obj = JsonUtil.getJsonMapper().convertValue(campaign, Campaign.class);
          obj.setIsLoaded(true);
          this.campaign = obj;
      }
  }
  public Profile getProfile() {
    return profile;
  }

  public void setProfile(Object profile)
  {
      if(profile instanceof String)
      {
          String strId;
          strId = (String)profile;

          Profile obj = new Profile();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.profile = obj;
      }
      else
      {
          Profile obj = JsonUtil.getJsonMapper().convertValue(profile, Profile.class);
          obj.setIsLoaded(true);
          this.profile = obj;
      }
  }
  public Date getUpdated() {
    return updated;
  }

  public void setUpdated(Date updated) {
      this.updated = updated;
  }
  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
      this.created = created;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  firstname: ").append(firstname).append("\n");
    sb.append("  lastname: ").append(lastname).append("\n");
    sb.append("  fullname: ").append(fullname).append("\n");
    sb.append("  accessToken: ").append(accessToken).append("\n");
    sb.append("  refreshToken: ").append(refreshToken).append("\n");
    sb.append("  provider: ").append(provider).append("\n");
    sb.append("  providerId: ").append(providerId).append("\n");
    sb.append("  emails: ").append(emails).append("\n");
    sb.append("  photos: ").append(photos).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  emailValidatedFlag: ").append(emailValidatedFlag).append("\n");
    sb.append("  username: ").append(username).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  hashed_password: ").append(hashed_password).append("\n");
    sb.append("  tempPasswordFlag: ").append(tempPasswordFlag).append("\n");
    sb.append("  campaign: ").append(campaign).append("\n");
    sb.append("  profile: ").append(profile).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

