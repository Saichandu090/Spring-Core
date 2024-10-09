package com.spring.primitivetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {

        System.out.println("Project Execution Started");

        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");

        Student a=context.getBean("student1", Student.class);
        System.out.println(a.hashCode());

        Student b=context.getBean("student1", Student.class);
        System.out.println(b.hashCode());

        System.out.println("Project Execution Completed");
    }
}
