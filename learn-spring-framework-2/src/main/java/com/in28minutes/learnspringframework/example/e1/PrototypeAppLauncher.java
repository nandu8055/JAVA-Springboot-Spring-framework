package com.in28minutes.learnspringframework.example.e1;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 
 */
@Component
class NormalClass{

}

@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{

}


@Configuration
@ComponentScan
public class PrototypeAppLauncher {

	public static void main(String[] args) {
		
		
		try(var context=new AnnotationConfigApplicationContext(PrototypeAppLauncher.class)){
			for (int i = 0; i < 4; i++) {
				System.out.println(context.getBean(NormalClass.class));
				System.out.println(context.getBean(PrototypeClass.class));
			}
		};
	}

}
