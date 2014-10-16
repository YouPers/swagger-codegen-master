package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.Assessment;
import com.youpers.model.User;
import com.youpers.model.Campaign;
import com.youpers.model.Topic;
import com.youpers.model.Answer;
public class AssessmentResult extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  /* reference to the user owning this Result */
  @JsonProperty("owner")
  private User owner = null;
  /* reference to the campaign this result was entered in, used for statistics */
  @JsonProperty("campaign")
  private Campaign campaign = null;
  @JsonProperty("topic")
  private Topic topic = null;
  /* reference to the assessment this result belongs to */
  @JsonProperty("assessment")
  private Assessment assessment = null;
  @JsonProperty("dirty")
  private Boolean dirty = null;
  @JsonProperty("answers")
  private List<Answer> answers = new ArrayList<Answer>();
  @JsonProperty("needForAction")
  private String needForAction = null;
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
  public Topic getTopic() {
    return topic;
  }

  public void setTopic(Object topic)
  {
      if(topic instanceof String)
      {
          String strId;
          strId = (String)topic;

          Topic obj = new Topic();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.topic = obj;
      }
      else
      {
          Topic obj = JsonUtil.getJsonMapper().convertValue(topic, Topic.class);
          obj.setIsLoaded(true);
          this.topic = obj;
      }
  }
  public Assessment getAssessment() {
    return assessment;
  }

  public void setAssessment(Object assessment)
  {
      if(assessment instanceof String)
      {
          String strId;
          strId = (String)assessment;

          Assessment obj = new Assessment();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.assessment = obj;
      }
      else
      {
          Assessment obj = JsonUtil.getJsonMapper().convertValue(assessment, Assessment.class);
          obj.setIsLoaded(true);
          this.assessment = obj;
      }
  }
  public Boolean getDirty() {
    return dirty;
  }

  public void setDirty(Boolean dirty) {
      this.dirty = dirty;
  }
  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }
  public String getNeedForAction() {
    return needForAction;
  }

  public void setNeedForAction(String needForAction) {
      this.needForAction = needForAction;
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
    sb.append("class AssessmentResult {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  campaign: ").append(campaign).append("\n");
    sb.append("  topic: ").append(topic).append("\n");
    sb.append("  assessment: ").append(assessment).append("\n");
    sb.append("  dirty: ").append(dirty).append("\n");
    sb.append("  answers: ").append(answers).append("\n");
    sb.append("  needForAction: ").append(needForAction).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

