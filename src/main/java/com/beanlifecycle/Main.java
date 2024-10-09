package com.beanlifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Started");

        AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifecyclexml.xml");
        Gta g=context.getBean("g1",Gta.class);
        System.out.println(g);
        context.registerShutdownHook();

        System.out.println("Ended");


//        Chicken chicken1=context.getBean("c1", Chicken.class);
//        System.out.println(chicken1);
//
//        System.out.println("Ended");
//        context.registerShutdownHook();
    }
}



//    public static void main(String[] args) {
//        System.out.println("Start");
//        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecyclexml.xml");
//        Exam exam1 = context.getBean("e1", Exam.class);
//        System.out.println(exam1);
//        System.out.println("End");
//        context.registerShutdownHook();
//    }