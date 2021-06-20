package com.feedback.entity;


public class Feedback
{
	
	private String firstname;
	private String lastname;
	private String mailid;
	private String country;
	private String subject;
	public Feedback()
	{
	}
	public Feedback(String firstname, String lastname, String mailid, String country, String subject) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.mailid = mailid;
		this.country = country;
		this.subject = subject;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Feedback [firstname=" + firstname + ", lastname=" + lastname + ", mailid=" + mailid + ", country="
				+ country + ", subject=" + subject + "]";
	}
}
