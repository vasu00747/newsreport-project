package com.asminds.NewsReport.DAO;

import java.util.List;

import com.asminds.NewsReport.Pojo.JournalistPojo;



public interface JournalistDAO {
	public boolean save(JournalistPojo p);
	public List<JournalistPojo> viewAll();
	public List<JournalistPojo> validateUser(JournalistPojo user);
	public List<JournalistPojo> viewbySpecialist(JournalistPojo emp);
}
