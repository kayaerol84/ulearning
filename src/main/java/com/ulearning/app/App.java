package com.ulearning.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ulearning.utils.AppConfig;
import com.ulearning.utils.MainBean;


public class App {

	
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/application-config.xml"});
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MainBean mainBean = context.getBean("firstBeanWhichIncludesControllers", MainBean.class);
		System.out.println(mainBean.getUserController().getDefaultUserInJSON());
		
		((AnnotationConfigApplicationContext)context).close();
	}
	
}