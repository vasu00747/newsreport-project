package com.asminds.NewsReport.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class JournalistPojo {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int journalistid;
	String journalistname;
	String password;
	String emailId;
	String gender;
	String mobileno;
	String address;
	String dob;


public JournalistPojo(int journalistid, String journalistname, String password, String emailId, String gender,
			String mobileno, String address, String dob) {
		super();
		this.journalistid = journalistid;
		this.journalistname = journalistname;
		this.password = password;
		this.emailId = emailId;
		this.gender = gender;
		this.mobileno = mobileno;
		this.address = address;
		this.dob = dob;
	}


public int getjournalistid() {
		return journalistid;
	}


	public void setjournalistid(int journalistid) {
		this.journalistid = journalistid;
	}


	public String getjournalistname() {
		return journalistname;
	}


	public void setjournalistname(String journalistname) {
		this.journalistname = journalistname;
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


public JournalistPojo() {
	super();
}

}
