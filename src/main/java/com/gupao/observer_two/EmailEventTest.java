package com.gupao.observer_two;

import com.google.common.eventbus.EventBus;

public class EmailEventTest {

	public static void main(String[] args) {
		//模拟http请求，后台接收学生提问封装成vo对象
		GupaoQuestion gq = new GupaoQuestion();
		gq.setStudentAccount("zhangsan");
		gq.setTeacherEmail("tom@163.com");
		gq.setQuestion("委派模式和策略模式分不清，感觉没有区别");

		//先进行持久化
		IGupaoQuestionService gpService = new GupaoQuestionServiceImpl();
		gpService.save(gq);
		
		//再进行邮件推送
		//消息总线
        EventBus eventBus = new EventBus();
        EmailEvent emailEvent = new EmailEvent();
        eventBus.register(emailEvent);
        eventBus.post(gq);
	}

}
