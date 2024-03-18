package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age,Address address) {};
record Address(String firstline,String city) {};

@Configuration

public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "nandu";
	}
	@Bean
	public int age() {
		return 20;
	}
	@Bean
	public Person person() {
		return new Person("vinchenzo",15,new Address("theatre","jadcherla"));
	}
	@Bean
	public Person personByMethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	public Person personByParameters(String name,int age,Address add2) {
		return new Person(name,age,add2);
	}
	
	@Bean(name="add2")
	@Primary
	public Address address() {
		return new Address("theatre","jadcherla");
	}
	@Bean(name="add3")
	public Address add3() {
		return new Address("ad3","ere");
	}
}
