package com.di.multipleconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{

    public static void main(String[] args) {

        System.out.println("Start");

        ApplicationContext context=new ClassPathXmlApplicationContext("Test.xml");
        Test test=context.getBean("t1", Test.class);
        System.out.println(test);
        test.add();
        System.out.println("End");
    }
}
