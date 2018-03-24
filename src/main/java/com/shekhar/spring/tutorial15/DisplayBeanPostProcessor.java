package com.shekhar.spring.tutorial15;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * This class is mainly used when we wanted to perform certain tasks before and after initialization of
 * evey bean.
 * Imp points :-
 * 1. After evey bean is initialized the methods of BeanPostProcessor is called.
 * 2. We create a separate class for BeanPostProcess and we have two methods in it
 * which are called before and after initialization of each bean.
 * @author choudshe
 *
 */
public class DisplayBeanPostProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After initialization of bean "+beanName);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before initialization of bean "+beanName);
		return bean;
	}

}
