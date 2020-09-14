package com.yangtengfei.springframework.user;


import org.springframework.stereotype.Component;

@Component
public class UserDao2 implements UserDao{
	@Override
	public void show() {
		System.out.println("2222222222222");
	}
}
