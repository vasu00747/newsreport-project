package com.asminds.NewsReport.DAO;

import java.util.List;

import com.asminds.NewsReport.Pojo.FeedbackPojo;





public interface FeedbackDAO {

	public boolean save(FeedbackPojo p);
	public List<FeedbackPojo> viewAll();
	
}
