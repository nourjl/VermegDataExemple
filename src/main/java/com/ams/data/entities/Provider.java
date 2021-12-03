package com.ams.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Provider {
@Id //primary Key
 @GeneratedValue(strategy = GenerationType.AUTO) //auto-increment
 private long id;


 @NotBlank(message = "Name is mandatory") //null avec message au cas d'erreur
 @Column(name = "name")
 private String name;

 @NotBlank(message = "Address is mandatory")
 @Column(name = "address")
 private String address;

 @NotBlank(message = "Email is mandatory")
 @Column(name = "email")
 private String email;
 
 //constructors
 public Provider() {}
 
 public Provider(String name, String address, String email) {
 this.name = name;
 this.address = address;
 this.email = email;
 }
 
 //getters and setters
 public void setId(long id) {
 this.id = id;
 }
 public long getId() {
 return id;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getName() {
 return name;
 }
 public void setEmail(String email) {
 this.email = email;
 }
 public String getEmail() {
	 return email;
 }
 public void setAddress(String address) {
 this.address = address;
 }
 public String getAddress() {
 return address;
 }
}

