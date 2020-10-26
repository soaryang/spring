package com.yangtengfei.springframework;


import com.yangtengfei.springframework.importClass.UserServiceBeanDefinitionRegistrar;
import com.yangtengfei.springframework.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@ComponentScan("com.yangtengfei.springframework")
@Component
@EnableAspectJAutoProxy
@Description("12312312312312")
@Import(value={UserServiceBeanDefinitionRegistrar.class})
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
