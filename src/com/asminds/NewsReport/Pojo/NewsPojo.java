package com.asminds.NewsReport.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewsPojo {

	String category;
	@Id
	int id;
String postname;
String description;
String location;
String image;


public NewsPojo(String category, int id ,String postname, String description, String location, String image) {
	super();
	this.category = category;
	this.id =id;
	this.postname = postname;
	this.description = description;
	this.location = location;
	this.image = image;
}







public int getId() {
	return id;
}







public void setId(int id) {
	this.id = id;
}







public String getCategory() {
	return category;
}







public void setCategory(String category) {
	this.category = category;
}







public String getPostname() {
	return postname;
}







public void setPostname(String postname) {
	this.postname = postname;
}







public String getDescription() {
	return description;
}







public void setDescription(String description) {
	this.description = description;
}







public String getLocation() {
	return location;
}







public void setLocation(String location) {
	this.location = location;
}







public String getImage() {
	return image;
}







public void setImage(String image) {
	this.image = image;
}







public NewsPojo() {
	super();
}

}
