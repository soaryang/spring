package com.yangtengfei.springframework.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class LazyBean {

	public void show() {
		System.out.println("==============show");
	}
}
