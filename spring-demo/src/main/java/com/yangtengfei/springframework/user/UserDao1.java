package com.yangtengfei.springframework.user;

import org.springframework.stereotype.Component;

@Component
public class UserDao1 implements UserDao{
	@Override
	public void show() {
		System.out.println("11111111111111111");
	}
}
