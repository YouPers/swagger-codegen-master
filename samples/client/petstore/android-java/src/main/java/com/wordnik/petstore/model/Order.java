package com.wordnik.petstore.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
public class Order {
  @JsonProperty("id")
  private Long id = null;
  @JsonProperty("petId")
  private Long petId = null;
  @JsonProperty("quantity")
  private Integer quantity = null;
  /* Order Status */
  @JsonProperty("status")
  private String status = null;
  @JsonProperty("shipDate")
  private Date shipDate = null;
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  public Long getPetId() {
    return petId;
  }
  public void setPetId(Long petId) {
    this.petId = petId;
  }

  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  public Date getShipDate() {
    return shipDate;
  }
  public void setShipDate(Date shipDate) {
    this.shipDate = shipDate;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  petId: ").append(petId).append("\n");
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  shipDate: ").append(shipDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

