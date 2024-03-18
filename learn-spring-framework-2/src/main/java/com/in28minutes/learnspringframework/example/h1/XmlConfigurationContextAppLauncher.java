package com.in28minutes.learnspringframework.example.h1;

import java.util.Arrays;

import com.in28minutes.learnspringframework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 */

public class XmlConfigurationContextAppLauncher {

	public static void main(String[] args) {
		
		
		try(var context=new ClassPathXmlApplicationContext("contextConfig.xml")){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean("name"));
			context.getBean(GameRunner.class).run();
		}
	}

}
