package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Start");

        ApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");

        Certificate c=context.getBean("cer1", Certificate.class);
        System.out.println(c);

        Certificate c2=context.getBean("cer2", Certificate.class);
        System.out.println(c2);

        Student s=context.getBean("s1",Student.class);
        System.out.println(s);
        System.out.println("End");
    }
}
