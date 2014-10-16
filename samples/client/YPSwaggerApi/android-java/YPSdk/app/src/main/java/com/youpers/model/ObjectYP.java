package com.youpers.model;
public class ObjectYP {
  //@JsonProperty("idObj")
  private String idObj = null;
  public String getIdObj() {
    return idObj;
  }
  public void setIdObj(String idObj) {
    this.idObj = idObj;
  }

  private Boolean isLoaded = null;
  public Boolean getIsLoaded() {
        return isLoaded;
    }
    public void setIsLoaded(Boolean isLoaded) {
        this.isLoaded = isLoaded;
    }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectYP {\n");
    sb.append("  idObj: ").append(idObj).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

