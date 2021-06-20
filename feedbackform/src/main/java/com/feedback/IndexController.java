package com.feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.feedback.dao.FeedbackDao;
import com.feedback.entity.Feedback;

@Controller
public class IndexController 
{
	@Autowired
	FeedbackDao fdo;
	Feedback fed;
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("/feedback.html")
	public String feedback()
	{
		return "feedback.jsp";
	}
	@RequestMapping("/addFeedback")
	public String addFeedback(@ModelAttribute("fed") Feedback fed)
	{
		fdo.addFeedback(fed);
		return "welcome.jsp";
	}
}
	
