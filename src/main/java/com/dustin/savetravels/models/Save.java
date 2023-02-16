package com.dustin.savetravels.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="saves")
public class Save {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotBlank
  private String expense;

  @NotBlank
  private String vendor;

  @NotNull
  private Integer amount;
  
  @NotBlank
  private String description;

  public Save(){
  }

  public Save(Long id, String expense, String vendor, Integer amount, String description) {
    this.id = id;
    this.expense = expense;
    this.vendor = vendor;
    this.amount = amount;
    this.description = description;
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getExpense() {
    return this.expense;
  }

  public void setExpense(String expense) {
    this.expense = expense;
  }

  public String getVendor() {
    return this.vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public Integer getAmount() {
    return this.amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
