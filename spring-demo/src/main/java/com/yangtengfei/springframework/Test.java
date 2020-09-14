package com.yangtengfei.springframework;

import com.yangtengfei.springframework.user.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println(annotationConfigApplicationContext);
		//Student student = (Student) annotationConfigApplicationContext.getBean("student");
		//Student student =  annotationConfigApplicationContext.getBean(Student.class);
		//Student student = (Student) annotationConfigApplicationContext.getBean(Student.class);
		//student.show();

		AppConfig userDao = (AppConfig) annotationConfigApplicationContext.getBean("appConfig");
		userDao.show();
	}
}
