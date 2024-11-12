package com.spring.spring_di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    public static void main( String[] args){
    	ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configure.xml");
        Javatrainer j = (Javatrainer) cpx.getBean("java");
        System.out.println("Java Trainer: "+j.getName());
        
        Sqltrainer s = (Sqltrainer) cpx.getBean("sql");
        System.out.println("SQL Trainer: "+s.getName());
        
        Webtrainer w = (Webtrainer) cpx.getBean("web");
        System.out.println("Web Trainer: "+w.getName());

    }
}