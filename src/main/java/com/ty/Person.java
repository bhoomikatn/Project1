package com.ty;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
   private int id;
   private String name;
   private String adress;
   private long phone;
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
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", adress=" + adress + ", phone=" + phone + "]";
}
   
}
