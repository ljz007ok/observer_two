package com.gupao.observer_two;

/**
 * gap学生提问VO
 * @author ljz
 *
 */
public class GupaoQuestion {	
	private String studentAccount;
	private String teacherEmail;
	private String question;
	public String getStudentAccount() {
		return studentAccount;
	}
	public void setStudentAccount(String studentAccount) {
		this.studentAccount = studentAccount;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
		
}
