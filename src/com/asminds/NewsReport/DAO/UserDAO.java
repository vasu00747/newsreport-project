package com.asminds.NewsReport.DAO;

import java.util.List;

import com.asminds.NewsReport.Pojo.UserPojo;


public interface UserDAO {
	public boolean save(UserPojo p);
	public List<UserPojo> viewAll();
	public List<UserPojo> validateUser(UserPojo user);
}
