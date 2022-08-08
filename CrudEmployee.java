package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CrudEmployee {
	@Id
int id;
String name;
int price;
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
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "CrudEmployee [id=" + id + ", name=" + name + ", price=" + price + "]";
}
public CrudEmployee(int id, String name, int price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public CrudEmployee() {
	super();
	// TODO Auto-generated constructor stub
}


}
