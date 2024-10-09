package com.spring.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Execution started!!");

        ApplicationContext context=new ClassPathXmlApplicationContext("Demo3.xml");
        Father f1=context.getBean("f1", Father.class);
        System.out.println(f1);
        Son s1=context.getBean("s1",Son.class);
        System.out.println(s1);
        System.out.println("Execution Terminated!!");
    }
}
