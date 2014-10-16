package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.I18nString;
public class Topic extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("nameI18n")
  private I18nString nameI18n = null;
  @JsonProperty("shortDescriptionI18n")
  private I18nString shortDescriptionI18n = null;
  @JsonProperty("longDescriptionI18n")
  private I18nString longDescriptionI18n = null;
  @JsonProperty("picture")
  private String picture = null;
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
  public I18nString getNameI18n() {
    return nameI18n;
  }

  public void setNameI18n(Object nameI18n)
  {
      if(nameI18n instanceof String)
      {
          String strId;
          strId = (String)nameI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.nameI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(nameI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.nameI18n = obj;
      }
  }
  public I18nString getShortDescriptionI18n() {
    return shortDescriptionI18n;
  }

  public void setShortDescriptionI18n(Object shortDescriptionI18n)
  {
      if(shortDescriptionI18n instanceof String)
      {
          String strId;
          strId = (String)shortDescriptionI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.shortDescriptionI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(shortDescriptionI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.shortDescriptionI18n = obj;
      }
  }
  public I18nString getLongDescriptionI18n() {
    return longDescriptionI18n;
  }

  public void setLongDescriptionI18n(Object longDescriptionI18n)
  {
      if(longDescriptionI18n instanceof String)
      {
          String strId;
          strId = (String)longDescriptionI18n;

          I18nString obj = new I18nString();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.longDescriptionI18n = obj;
      }
      else
      {
          I18nString obj = JsonUtil.getJsonMapper().convertValue(longDescriptionI18n, I18nString.class);
          obj.setIsLoaded(true);
          this.longDescriptionI18n = obj;
      }
  }
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
      this.picture = picture;
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
    sb.append("class Topic {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nameI18n: ").append(nameI18n).append("\n");
    sb.append("  shortDescriptionI18n: ").append(shortDescriptionI18n).append("\n");
    sb.append("  longDescriptionI18n: ").append(longDescriptionI18n).append("\n");
    sb.append("  picture: ").append(picture).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

