package com.asminds.NewsReport.Pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class TestPojo {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	int testid;
	String subjectname;
	String question;
	String optionA;
	String optionB;
	String optionC;
	String optionD;
	String answer;



public TestPojo(int testid, String subjectname, String question, String optionA, String optionB, String optionC,
			String optionD, String answer) {
		super();
		this.testid = testid;
		this.subjectname = subjectname;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
	}



public int getTestid() {
		return testid;
	}



	public void setTestid(int testid) {
		this.testid = testid;
	}



	public String getSubjectname() {
		return subjectname;
	}



	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}



	public String getQuestion() {
		return question;
	}



	public void setQuestion(String question) {
		this.question = question;
	}



	public String getOptionA() {
		return optionA;
	}



	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}



	public String getOptionB() {
		return optionB;
	}



	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}



	public String getOptionC() {
		return optionC;
	}



	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}



	public String getOptionD() {
		return optionD;
	}



	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



public TestPojo() {
	super();
}

}
