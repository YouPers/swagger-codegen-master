package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import com.youpers.model.AssessmentQuestion;
public class Focus extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("timestamp")
  private Date timestamp = null;
  @JsonProperty("question")
  private AssessmentQuestion question = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
      this.timestamp = timestamp;
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
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Focus {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  question: ").append(question).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

