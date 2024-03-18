package com.in28minutes.learnspringframework.example.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


/**
 * this is a field injection example
 */
/**
 * 
 */
@Component
class YourBusiness {
	
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	
	
//	@Autowired
//	 public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection -dependency1");
//		this.dependency1 = dependency1;
//	}
//
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection -dependency2");
//		this.dependency2 = dependency2;
//	}


	//@Autowired
	//RECOMMENDED
	public YourBusiness(Dependency1 dependency1, Dependency2 dependency2) {

		super();
		System.out.println("constructor Injection -dependency1&2");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}



	public String toString() {
		 return "Using"+ dependency1+" and "+ dependency2;
	 }
	
}
@Component
class Dependency1{

}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
public class DepInjectionGamingAppLauncher {

	public static void main(String[] args) {
		
		
		try(var context=new AnnotationConfigApplicationContext(DepInjectionGamingAppLauncher.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusiness.class));
		};
	}

}
