package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.WorkAddress;
import com.youpers.model.User;
import com.youpers.model.Campaign;
import com.youpers.model.HomeAddress;
import com.youpers.model.Prefs;
public class Profile extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("homeAddress")
  private HomeAddress homeAddress = null;
  @JsonProperty("workAddress")
  private WorkAddress workAddress = null;
  @JsonProperty("prefs")
  private Prefs prefs = null;
  @JsonProperty("owner")
  private User owner = null;
  @JsonProperty("gender")
  private String gender = null;
  @JsonProperty("birthDate")
  private Date birthDate = null;
  @JsonProperty("campaign")
  private Campaign campaign = null;
  @JsonProperty("maritalStatus")
  private String maritalStatus = null;
  @JsonProperty("language")
  private String language = null;
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
  public HomeAddress getHomeAddress() {
    return homeAddress;
  }

  public void setHomeAddress(Object homeAddress)
  {
      if(homeAddress instanceof String)
      {
          String strId;
          strId = (String)homeAddress;

          HomeAddress obj = new HomeAddress();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.homeAddress = obj;
      }
      else
      {
          HomeAddress obj = JsonUtil.getJsonMapper().convertValue(homeAddress, HomeAddress.class);
          obj.setIsLoaded(true);
          this.homeAddress = obj;
      }
  }
  public WorkAddress getWorkAddress() {
    return workAddress;
  }

  public void setWorkAddress(Object workAddress)
  {
      if(workAddress instanceof String)
      {
          String strId;
          strId = (String)workAddress;

          WorkAddress obj = new WorkAddress();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.workAddress = obj;
      }
      else
      {
          WorkAddress obj = JsonUtil.getJsonMapper().convertValue(workAddress, WorkAddress.class);
          obj.setIsLoaded(true);
          this.workAddress = obj;
      }
  }
  public Prefs getPrefs() {
    return prefs;
  }

  public void setPrefs(Object prefs)
  {
      if(prefs instanceof String)
      {
          String strId;
          strId = (String)prefs;

          Prefs obj = new Prefs();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.prefs = obj;
      }
      else
      {
          Prefs obj = JsonUtil.getJsonMapper().convertValue(prefs, Prefs.class);
          obj.setIsLoaded(true);
          this.prefs = obj;
      }
  }
  public User getOwner() {
    return owner;
  }

  public void setOwner(Object owner)
  {
      if(owner instanceof String)
      {
          String strId;
          strId = (String)owner;

          User obj = new User();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.owner = obj;
      }
      else
      {
          User obj = JsonUtil.getJsonMapper().convertValue(owner, User.class);
          obj.setIsLoaded(true);
          this.owner = obj;
      }
  }
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
      this.gender = gender;
  }
  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
      this.birthDate = birthDate;
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
  public String getMaritalStatus() {
    return maritalStatus;
  }

  public void setMaritalStatus(String maritalStatus) {
      this.maritalStatus = maritalStatus;
  }
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
      this.language = language;
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
    sb.append("class Profile {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  homeAddress: ").append(homeAddress).append("\n");
    sb.append("  workAddress: ").append(workAddress).append("\n");
    sb.append("  prefs: ").append(prefs).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  gender: ").append(gender).append("\n");
    sb.append("  birthDate: ").append(birthDate).append("\n");
    sb.append("  campaign: ").append(campaign).append("\n");
    sb.append("  maritalStatus: ").append(maritalStatus).append("\n");
    sb.append("  language: ").append(language).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

