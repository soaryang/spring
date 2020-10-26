package com.yangtengfei.springframework.importClass;

import com.yangtengfei.springframework.Student;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class UserServiceBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder userService = BeanDefinitionBuilder.rootBeanDefinition(Student.class);
		//通过registry就可以注入到容器里啦
		registry.registerBeanDefinition("student", userService.getBeanDefinition());
	}
}
