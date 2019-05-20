package com.asminds.NewsReport.DAO;

import java.util.List;

import com.asminds.NewsReport.Pojo.NewsPojo;


public interface NewsDAO {
	public boolean save(NewsPojo p);
	public List<NewsPojo> viewAll();
	public void delete(int id);
}
