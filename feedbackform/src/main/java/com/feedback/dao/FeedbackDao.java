package com.feedback.dao;

import org.springframework.stereotype.Component;

import com.feedback.entity.Feedback;

@Component
public class FeedbackDao {
	public void addFeedback(Feedback fed) {
		// TODO Auto-generated method stub
		System.out.print("Hello"+fed);
		
	}
}
