package org.springframework;

import org.springframework.beans.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		xml();
	}

	private static void xml() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:xml/application.xml");
		People bean = applicationContext.getBean(People.class);
		System.out.println(bean);
	}
}