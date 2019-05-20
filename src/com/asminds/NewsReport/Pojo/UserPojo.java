package com.asminds.NewsReport.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity 
public class UserPojo {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	int userid;
String username;
String password;
String emailId;
String gender;
String mobileno;
String address;
String dob;

public UserPojo(int userid, String username, String password, String emailId, String gender,
		String mobileno, String address, String dob) {
	super();
	this.userid =userid;
	this.username = username;
	this.password = password;
	this.emailId = emailId;
	this.gender = gender;
	this.mobileno = mobileno;
	this.address = address;
	this.dob = dob;
}

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getMobileno() {
	return mobileno;
}

public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public UserPojo() {
	super();
}



}
