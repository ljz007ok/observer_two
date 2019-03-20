package com.gupao.observer_two;

public class EmailPushImpl implements IEmailPush {
	public void push(GupaoQuestion gq) {
		System.out.println("向"+gq.getTeacherEmail()+"老师，发送邮件，内容如下"+gq.getQuestion());
	}
}
