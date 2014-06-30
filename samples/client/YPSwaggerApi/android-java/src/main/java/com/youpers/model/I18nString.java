package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

public class I18nString extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("de")
  private String de = null;
  @JsonProperty("en")
  private String en = null;
  @JsonProperty("fr")
  private String fr = null;
  @JsonProperty("it")
  private String it = null;
  public String getId() {
    return id;
  }

  public void setId(String id) {
      this.id = id;
  }
  public String getDe() {
    return de;
  }

  public void setDe(String de) {
      this.de = de;
  }
  public String getEn() {
    return en;
  }

  public void setEn(String en) {
      this.en = en;
  }
  public String getFr() {
    return fr;
  }

  public void setFr(String fr) {
      this.fr = fr;
  }
  public String getIt() {
    return it;
  }

  public void setIt(String it) {
      this.it = it;
  }
  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class I18nString {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  de: ").append(de).append("\n");
    sb.append("  en: ").append(en).append("\n");
    sb.append("  fr: ").append(fr).append("\n");
    sb.append("  it: ").append(it).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

