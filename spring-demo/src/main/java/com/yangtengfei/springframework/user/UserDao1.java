package com.yangtengfei.springframework.user;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class UserDao1 implements UserDao{
	@Override
	public void show() {
		System.out.println("11111111111111111");
	}
}
