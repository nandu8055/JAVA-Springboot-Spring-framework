package com.in28minutes.learnspringframework.example.f1;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 
 */
@Component
class SomeClass{
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency){
		super();
		this.someDependency=someDependency;
		System.out.println("all dependencies are ready");
	}
	@PostConstruct
	public void initialization(){
		someDependency.getReady();
	}
}
@Component
class SomeDependency{

	public void getReady() {
		System.out.println("some logic using dependency");
	}
}
@Configuration
@ComponentScan
public class PrePostAnnotationAppLauncher {

	public static void main(String[] args) {
		
		
		try(var context=new AnnotationConfigApplicationContext(PrePostAnnotationAppLauncher.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		};
	}

}
