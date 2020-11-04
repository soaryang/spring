package com.yangtengfei.springframework.processor;

import com.yangtengfei.springframework.UserSecondBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class CustomizeBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {

		//创建一个bean的定义类的对象，bean类型是CalculateServiceImpl
		RootBeanDefinition userSecondBean = new RootBeanDefinition(UserSecondBean.class);

		//bean的定义注册到spring环境
		beanDefinitionRegistry.registerBeanDefinition("userSecondBean", userSecondBean);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {


	}
}