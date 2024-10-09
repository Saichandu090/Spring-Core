package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client
{
    public static void main(String[] args)
    {
        System.out.println("Start");

        ApplicationContext context=new ClassPathXmlApplicationContext("spel.xml");
        SpElExp s1=context.getBean("bean1",SpElExp.class);
        System.out.println(s1);

        System.out.println("End");
    }
}
