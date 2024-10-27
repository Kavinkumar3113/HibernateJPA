package com.HibernateJPA;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
   @Id
   int id;
   String name;
   String lap;
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
public String getLap() {
	return lap;
}
public void setLap(String lap) {
	this.lap = lap;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", lap=" + lap + "]";
}
   
   
}
