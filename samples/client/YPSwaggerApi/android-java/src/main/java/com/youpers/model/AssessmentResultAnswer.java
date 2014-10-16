package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.Assessment;
import com.youpers.model.AssessmentQuestion;
public class AssessmentResultAnswer extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("assessment")
  private Assessment assessment = null;
  @JsonProperty("question")
  private AssessmentQuestion question = null;
  @JsonProperty("answer")
  private Long answer = null;
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
  public AssessmentQuestion getQuestion() {
    return question;
  }

  public void setQuestion(Object question)
  {
      if(question instanceof String)
      {
          String strId;
          strId = (String)question;

          AssessmentQuestion obj = new AssessmentQuestion();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.question = obj;
      }
      else
      {
          AssessmentQuestion obj = JsonUtil.getJsonMapper().convertValue(question, AssessmentQuestion.class);
          obj.setIsLoaded(true);
          this.question = obj;
      }
  }
  public Long getAnswer() {
    return answer;
  }

  public void setAnswer(Long answer) {
      this.answer = answer;
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
    sb.append("class AssessmentResultAnswer {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  assessment: ").append(assessment).append("\n");
    sb.append("  question: ").append(question).append("\n");
    sb.append("  answer: ").append(answer).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

