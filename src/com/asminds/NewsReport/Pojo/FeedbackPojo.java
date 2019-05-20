package com.asminds.NewsReport.Pojo;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class FeedbackPojo {

	@Id
	String email;
	String country;
	String state;
	String district;
	String fullname;
	String organizername;
	String mobileno;
	String feedbacktype;
	String feedbackmessage;

	public FeedbackPojo(String email, String country, String state, String district, String fullname, String organizername,
			String mobileno, String feedbacktype, String feedbackmessage) {
		super();
		this.email = email;
		this.country = country;
		this.state = state;
		this.district = district;
		this.fullname = fullname;
		this.organizername = organizername;
		this.mobileno = mobileno;
		this.feedbacktype = feedbacktype;
		this.feedbackmessage = feedbackmessage;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getorganizername() {
		return organizername;
	}

	public void setorganizername(String organizername) {
		this.organizername = organizername;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getFeedbacktype() {
		return feedbacktype;
	}

	public void setFeedbacktype(String feedbacktype) {
		this.feedbacktype = feedbacktype;
	}

	public String getFeedbackmessage() {
		return feedbackmessage;
	}

	public void setFeedbackmessage(String feedbackmessage) {
		this.feedbackmessage = feedbackmessage;
	}

	public FeedbackPojo() {
		super();
	}

}
