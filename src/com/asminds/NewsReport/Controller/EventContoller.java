package com.asminds.NewsReport.Controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.asminds.NewsReport.DAOImplementation.NewsDAOImplementation;
import com.asminds.NewsReport.DAOImplementation.FeedbackDAOImplementation;
import com.asminds.NewsReport.DAOImplementation.JournalistDAOImplementation;
import com.asminds.NewsReport.DAOImplementation.TestDAOImplementation;
import com.asminds.NewsReport.DAOImplementation.UserDAOImplementation;
import com.asminds.NewsReport.Pojo.NewsPojo;
import com.asminds.NewsReport.Pojo.FeedbackPojo;
import com.asminds.NewsReport.Pojo.JournalistPojo;
import com.asminds.NewsReport.Pojo.LoginPojo;
import com.asminds.NewsReport.Pojo.TestPojo;
import com.asminds.NewsReport.Pojo.UserPojo;



@Controller

public class EventContoller {

	
	@RequestMapping("/")
	public String a1() {
		System.out.println("Welcome to index page");
		return "index";

	}
	@RequestMapping("/home")
	public String a2() {
		System.out.println("Welcome to home page");
		return "index";
	}
	@RequestMapping("/adminloginpage")
	public String adminlogin() {
		System.out.println("Welcome to admin login page");
		return "adminloginpage";
	}

	@RequestMapping("/user")
	public String a3() {
		System.out.println("Welcome to user page");
		return "user";
	}
	@RequestMapping("/journalist")
	public String a() {
		System.out.println("Welcome to user page");
		return "journalist";
	}
	@RequestMapping("/viewjournalist")
	public ModelAndView viewuserdetails(@ModelAttribute("t") NewsPojo p) {
		System.out.println("I am in view user page");
		NewsDAOImplementation a = new NewsDAOImplementation();
		List<NewsPojo> b = a.viewAll();
		return new ModelAndView("journalistpage", "userList", b);

	}
	@RequestMapping("/registration")
	public String a4() {
		System.out.println("Welcome to registration page");
		return "registration";
	}
	@RequestMapping("/delete/{id}")
	public ModelAndView approve(@PathVariable int id) {
		
		NewsDAOImplementation a = new NewsDAOImplementation();
		a.delete(id);
		System.out.println("deleted");
		String s="Successfully deleted!";
		return new ModelAndView("fetchnewslisteditor","a",s);
	}
	@RequestMapping("/registrationuser")
	public String registrationcustomer() {
		System.out.println("Welcome to registration user page");
		return "registrationuser";
	}
	@RequestMapping("/registrationjournalist")
	public String registrationjournalist() {
		System.out.println("Welcome to registration journalist page");
		return "registrationjournalist";
	}
	@RequestMapping("/addnews")
	public String addvenue() {
		System.out.println("Welcome to add news page");
		return "addnews";
	}
	@RequestMapping("/addfeedback")
	public String addfeedback() {
		System.out.println("Welcome to add feedback page");
		return "addfeedback";
	}
	@RequestMapping("/addtest")
	public String addtest() {
		System.out.println("Welcome to add test page");
		return "addtest";
	}
	@RequestMapping("/testcategory")
	public ModelAndView testcategory(@ModelAttribute("t")TestPojo subject) {
		System.out.println("I am in view test page");
		TestDAOImplementation a = new TestDAOImplementation();
		//String subject=i.getSubjectname();
		List<TestPojo> b = a.viewAll();
		Iterator it=b.iterator();
		while (it.hasNext()) {
			Object o = (Object) it.next();
			TestPojo p = (TestPojo) o;
			System.out.println(p.getQuestion());
			System.out.println(p.getAnswer());

		}
		return new ModelAndView("testcategory", "userList", b);

	}
	@RequestMapping("/taketest")
	public ModelAndView taketest(@ModelAttribute("o") TestPojo p) {
		System.out.println("Welcome to take test page");
		
		TestDAOImplementation i=new TestDAOImplementation();
		List<TestPojo> l=i.viewAll();
		System.out.println(p.getQuestion());
		return new ModelAndView("taketest","a",l);
	}
	@RequestMapping(value = "/formvalidationadmin", method = RequestMethod.POST)
	public ModelAndView formvalidation(@ModelAttribute("userform") LoginPojo user) {
		String username = user.getUsername();
		String password = user.getPassword();
		String wrong="Sorry! Invalid Username or Password...";
		if (username.equals("admin") && password.equals("123")) {
			return new ModelAndView("adminpage");
		} else {
			return new ModelAndView("index","wrong",wrong);
		}

	}
	
	@RequestMapping(value = "/formvalidationuser", method = RequestMethod.POST)
	public ModelAndView formvalidationuser(@ModelAttribute("userform") UserPojo user) {
		UserDAOImplementation i = new UserDAOImplementation();
		System.out.println("I am in validation page");
		List<UserPojo> v = i.validateUser(user);
		System.out.println("I am in Validating a Password");
		Iterator it = v.iterator();
		String a=user.getUsername();
		String wrong="Sorry! Invalid Username or Password...";
		if (v.size() != 0) {
			return new ModelAndView("userpage","a",a);
		} else {
			return new ModelAndView("index","wrong",wrong);
		}

	}
	@RequestMapping(value = "/formvalidationjournalist", method = RequestMethod.POST)
	public ModelAndView formvalidationjournalist(@ModelAttribute("userform") JournalistPojo user) {
		JournalistDAOImplementation i = new JournalistDAOImplementation();
		System.out.println("I am in validation page");
		List<JournalistPojo> v = i.validateUser(user);
		System.out.println("I am in Validating a Password");
		Iterator it = v.iterator();
		String a=user.getjournalistname();
		String wrong="Sorry! Invalid Username or Password...";
		if (v.size() != 0) {
			return new ModelAndView("journalistpage","a",a);
		} else {
			return new ModelAndView("index","wrong",wrong);
		}

	}
	@RequestMapping("/registersaveuser")
	public ModelAndView registersaveuser(@ModelAttribute("z") UserPojo i) {
		System.out.println("i am in register save action");
		System.out.println(i.getUserid());
		System.out.println(i.getEmailId());
		System.out.println(i.getPassword());
		System.out.println(i.getUsername());
		System.out.println(i.getDob());

		UserDAOImplementation l = new UserDAOImplementation();
		l.save(i);
		String s = i.getUsername();
		int j= i.getUserid();
		String str="Registration Success! Your User id is  " +j ;
		
		return new ModelAndView("userpage", "a", str);
	}
	@RequestMapping("/registersavetest")
	public ModelAndView registersavetest(@ModelAttribute("z") TestPojo i) {
		System.out.println("i am in register save test action");
		System.out.println(i.getSubjectname());
		System.out.println(i.getQuestion());
		System.out.println(i.getAnswer());

		TestDAOImplementation l = new TestDAOImplementation();
		l.save(i);
		String s = i.getQuestion();
		return new ModelAndView("addtest");
	}
	@RequestMapping("/registersavenews")
	public ModelAndView registersavenews(@ModelAttribute("z") NewsPojo i) {
		System.out.println("i am in register save news action");
		System.out.println(i.getPostname());
		System.out.println(i.getCategory());
		System.out.println(i.getDescription());

		NewsDAOImplementation l = new NewsDAOImplementation();
		l.save(i);
		String s = i.getPostname();
		return new ModelAndView("journalistpage");
	}
	@RequestMapping("/registersavejournalist")
	public ModelAndView registersavecontent(@ModelAttribute("z") JournalistPojo i) {
		System.out.println("i am in register venue save action");
		System.out.println(i.getjournalistname());
		System.out.println(i.getjournalistid());
		System.out.println(i.getPassword());
		System.out.println(i.getEmailId());
		JournalistDAOImplementation l = new JournalistDAOImplementation();
		l.save(i);
		String s = i.getjournalistname();
		return new ModelAndView("journalistpage" , "a",s);
	}
	@RequestMapping("/feedbacksave")
	public ModelAndView feedbacksave(@ModelAttribute("z") FeedbackPojo i) {
		System.out.println("i am in feedback save action");
		System.out.println(i.getFullname());
		System.out.println(i.getEmail());
		System.out.println(i.getFeedbackmessage());
		System.out.println(i.getFeedbacktype());
		System.out.println(i.getorganizername());

		FeedbackDAOImplementation l = new FeedbackDAOImplementation();
		l.save(i);
		String s = i.getorganizername();
		return new ModelAndView("customerpage");
	}
	
	
	@RequestMapping("/viewnews")
	public ModelAndView viewcontentdetails(@ModelAttribute("t") NewsPojo p) {
		System.out.println("I am in view content page");
		NewsDAOImplementation a = new NewsDAOImplementation();
		List<NewsPojo> b = a.viewAll();
		System.out.println(p.getPostname());
		return new ModelAndView("fetchnewslist", "userList", b);

	}
	@RequestMapping("/viewnewseditor")
	public ModelAndView viewnewsdetails(@ModelAttribute("t") NewsPojo p) {
		System.out.println("I am in view content page");
		NewsDAOImplementation a = new NewsDAOImplementation();
		List<NewsPojo> b = a.viewAll();
		System.out.println(p.getPostname());
		return new ModelAndView("fetchnewslisteditor", "userList", b);

	}
	@RequestMapping("/userlist")
	public ModelAndView viewuserdetails(@ModelAttribute("t") UserPojo p) {
		System.out.println("I am in view user page");
		UserDAOImplementation a = new UserDAOImplementation();
		List<UserPojo> b = a.viewAll();
		System.out.println(p.getUsername());
		return new ModelAndView("fetchuserlist", "userList", b);

	}
	@RequestMapping("/viewfeedback")
	public ModelAndView viewfeedback(@ModelAttribute("t") FeedbackPojo p) {
		System.out.println("I am in view venue page");
		FeedbackDAOImplementation a = new FeedbackDAOImplementation();
		List<FeedbackPojo> b = a.viewAll();
		System.out.println(p.getorganizername());
		return new ModelAndView("fetchfeedbacklist", "userList", b);

	}
	 
}
