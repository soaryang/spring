package com.yangtengfei.springframework;


import com.yangtengfei.springframework.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@ComponentScan("com.yangtengfei.springframework")
@Component
@EnableAspectJAutoProxy
@Description("12312312312312")
public class AppConfig {

	@Autowired
	private UserDao userDao;

	public void show() {
		System.out.println("1111111111111111111111111");
	}

	@Bean
	UserBean getBean() {
		return new UserBean();
	}
}
