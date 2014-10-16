package com.youpers.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youpers.utils.JsonUtil;

import java.util.Date;
import java.util.*;
import com.youpers.model.User;
import com.youpers.model.Address;
import com.youpers.model.Contact;
public class Organization extends ObjectYP {
  @JsonProperty("id")
  private String id = null;
  @JsonProperty("address")
  private Address address = null;
  @JsonProperty("contact")
  private Contact contact = null;
  @JsonProperty("name")
  private String name = null;
  @JsonProperty("legalForm")
  private String legalForm = null;
  @JsonProperty("sector")
  private String sector = null;
  @JsonProperty("administrators")
  private List<User> administrators = new ArrayList<User>();
  @JsonProperty("avatar")
  private String avatar = null;
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
  public Address getAddress() {
    return address;
  }

  public void setAddress(Object address)
  {
      if(address instanceof String)
      {
          String strId;
          strId = (String)address;

          Address obj = new Address();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.address = obj;
      }
      else
      {
          Address obj = JsonUtil.getJsonMapper().convertValue(address, Address.class);
          obj.setIsLoaded(true);
          this.address = obj;
      }
  }
  public Contact getContact() {
    return contact;
  }

  public void setContact(Object contact)
  {
      if(contact instanceof String)
      {
          String strId;
          strId = (String)contact;

          Contact obj = new Contact();
          obj.setId(strId);
          obj.setIsLoaded(false);
          this.contact = obj;
      }
      else
      {
          Contact obj = JsonUtil.getJsonMapper().convertValue(contact, Contact.class);
          obj.setIsLoaded(true);
          this.contact = obj;
      }
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
      this.name = name;
  }
  public String getLegalForm() {
    return legalForm;
  }

  public void setLegalForm(String legalForm) {
      this.legalForm = legalForm;
  }
  public String getSector() {
    return sector;
  }

  public void setSector(String sector) {
      this.sector = sector;
  }
  public List<User> getAdministrators() {
    return administrators;
  }

  public void setAdministrators(List<User> administrators) {
    this.administrators = administrators;
  }
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
      this.avatar = avatar;
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
    sb.append("class Organization {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  contact: ").append(contact).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  legalForm: ").append(legalForm).append("\n");
    sb.append("  sector: ").append(sector).append("\n");
    sb.append("  administrators: ").append(administrators).append("\n");
    sb.append("  avatar: ").append(avatar).append("\n");
    sb.append("  updated: ").append(updated).append("\n");
    sb.append("  created: ").append(created).append("\n");
    sb.append("  isLoaded: ").append(getIsLoaded()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

