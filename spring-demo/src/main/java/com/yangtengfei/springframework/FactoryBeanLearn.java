package com.yangtengfei.springframework;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanLearn implements FactoryBean<Teacher> {

	@Override
	public Teacher getObject() throws Exception {
		return null;
	}

	@Override
	public Class<Teacher> getObjectType() {
		return Teacher.class;
	}


	@Override
	public boolean isSingleton() {
		return true;
	}
}