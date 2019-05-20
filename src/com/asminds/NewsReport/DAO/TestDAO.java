package com.asminds.NewsReport.DAO;

import java.util.List;

import com.asminds.NewsReport.Pojo.TestPojo;


public interface TestDAO {
	public boolean save(TestPojo p);
	public List<TestPojo> viewAll();
	
	public List<TestPojo> viewbySpecialist(TestPojo subject);
}
