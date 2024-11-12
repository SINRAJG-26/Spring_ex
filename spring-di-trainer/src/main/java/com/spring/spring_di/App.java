package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
    	ClassPathXmlApplicationContext cxp=new ClassPathXmlApplicationContext("configure.xml");
    	Employee e=(Employee)cxp.getBean("emp");
    	System.out.println(e.getName());
    	System.out.println(e.getExperience());
    	
    }
   
}
