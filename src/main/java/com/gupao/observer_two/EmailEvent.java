package com.gupao.observer_two;

import com.google.common.eventbus.Subscribe;

/**
 * 邮件通知
 * 
 * @author ljz
 *
 */
public class EmailEvent {
	@Subscribe
	public void subscribe(final GupaoQuestion gq) {
		new Thread(new Runnable() {
			public void run() {
				IEmailPush push = new EmailPushImpl();
				push.push(gq);
			}
		}) {
		}.start();
	}
}
