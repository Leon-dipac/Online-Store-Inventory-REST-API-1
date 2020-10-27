// Complete File for this project
package com.javaapilearning.crud.example;
/*
	The link for this tutorial is :
			https://www.youtube.com/watch?v=IucFDX3RO9U

	Let's create the REST APIs for Creating, Retrieving, Updating and Deleting 'CRUD'
	a product either by its name or its ID.

	In the below tutorial, we will develop Spring Boot Application to get the product's record from the database,
	Create / Update the product in the Database, Delete the product from the Database using REST API.

	- Spring Boot:  With Spring Boot, it is now a very easy process to create stand alone,
		ready for production spring applications with almost zero configuration.


	- JPA: JPA simplifies the data access layer. It requires no boilerplate code of DAO classes.

	- Hibernate: Hibernate is an ORM framework. It is the implementation of JPA. It requires no boilerplate jdbc code.

	- MySQL : MySQL Server Database.

	- REST API : REST is basically used for developing Web services which are maintainable, lightweight and scalable.

	- CRUD : CRUD is basically database operations – Create , Retrieve, Update and Delete.

*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// Let's push it on Github
public class SpringBootCrudExample1Application {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootCrudExample1Application.class, args);
	}

}
