package com.gupao.observer_two;

public class GupaoQuestionServiceImpl implements IGupaoQuestionService {

	public void save(GupaoQuestion gupaoQuestion) {
		System.out.println(gupaoQuestion.getStudentAccount()+"同学,你的提问："+gupaoQuestion.getQuestion()+",已经持久化,请等待老师解答！");
	}

}
