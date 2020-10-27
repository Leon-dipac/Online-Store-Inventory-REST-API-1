// Complete File for this project
package com.javaapilearning.crud.example.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/* We've added 'Lombok Dependency' to avoid writing getters and setters manually.
   Therefore we can add the following: */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


/*
   We need to add table with its table's name in order to
   generate that table in our database available on MySQL Server
   through MySQL Workbench.


*/
@Table(name = "Table_Of_Products_1") // Let's specify the table's name here

/*  First of all, we will create our object model class or bean called "Product"
* for our application to be able to Create, Retrieve, Update and Delete data related
* to an instantiated object from the client's systems. */

// Let's create a 'Model class', 'Entity model' or 'an entity class' with some fields :
public class Product {
 // Let's add our primary key:
    @Id
    //We want an auto generated id value by Hibernate:
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;

    // Let's manually write the Getters and Setters Methods for these fields :
    public int getId() {
      return id;
    }

   public void setId(int id) {
     this.id = id;
   }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

}
