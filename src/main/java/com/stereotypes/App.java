package com.stereotypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {

        System.out.println("Start");

        ApplicationContext context=new ClassPathXmlApplicationContext("stereotypes.xml");

        Ipl i1=context.getBean("ipl", Ipl.class);
        System.out.println(i1.hashCode());

        System.out.println("==================");

        Ipl i2=context.getBean("ipl", Ipl.class);
        System.out.println(i2.hashCode());

        System.out.println(i1);
        System.out.println("End");
    }
}
