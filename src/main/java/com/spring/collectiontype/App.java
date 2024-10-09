package com.spring.collectiontype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {

        System.out.println("Execution Started!!");

        ApplicationContext context=new ClassPathXmlApplicationContext("Demo2.xml");
        Employee emp1=context.getBean("emp1", Employee.class);

        System.out.println(emp1);

        System.out.println("Execution Terminated!!");
    }
}
