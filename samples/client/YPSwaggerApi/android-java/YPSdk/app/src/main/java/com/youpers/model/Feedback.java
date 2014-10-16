package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

public class Feedback extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("contactInfo")
  private String contactInfo = null;
  @JsonProperty("feedbackCategory")
  private String feedbackCategory = null;
  @JsonProperty("description")
  private String description = null;
  @JsonProperty("navigator")
  private String navigator = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public String getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(String contactInfo) {
      this.contactInfo = contactInfo;
  }
  public String getFeedbackCategory() {
    return feedbackCategory;
  }

  public void setFeedbackCategory(String feedbackCategory) {
      this.feedbackCategory = feedbackCategory;
  }
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
      this.description = description;
  }
  public String getNavigator() {
    return navigator;
  }

  public void setNavigator(String navigator) {
      this.navigator = navigator;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  contactInfo: ").append(contactInfo).append("\n");
    sb.append("  feedbackCategory: ").append(feedbackCategory).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  navigator: ").append(navigator).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

