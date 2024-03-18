package com.in28minutes.learnspringframework.example.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 
 */
@Component
class ClassA{}
@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA){
		System.out.println("flag");
		this.classA=classA;
	}

	public void getSomething() {
		System.out.println("done");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationAppLauncher {

	public static void main(String[] args) {
		
		
		try(var context=new AnnotationConfigApplicationContext(LazyInitializationAppLauncher.class)){
			System.out.println("initialization complete");
			context.getBean(ClassB.class).getSomething();
		};
	}

}
