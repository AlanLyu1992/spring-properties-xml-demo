package com.alanlyu.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alanlyu.springdemo.domain.Organization;
import com.alanlyu.springdemo.domain.promotion.TradeFair;


public class PropertiesWithXmlApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create the application context(container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Organization org = (Organization) ctx.getBean("myorg");
		System.out.println(org);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
