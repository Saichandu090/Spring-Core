package com.programwithoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {

        System.out.println("Start");

        ApplicationContext context=new AnnotationConfigApplicationContext(PizzaConfig.class);
        Pizza pizza=context.getBean("a",Pizza.class);
        System.out.println(pizza);
        pizza.deliver();

        System.out.println("==========================");
        Pepsi c=context.getBean("getPepsi",Pepsi.class);
        System.out.println(c);
        c.drink();

        System.out.println("End");
    }
}


// -- for @Bean we use like this

//public static void main(String[] args) {
//
//    System.out.println("Start");
//
//    ApplicationContext context=new AnnotationConfigApplicationContext(PizzaConfig.class);
//    Pizza pizza=context.getBean("getPizza",Pizza.class);
//    System.out.println(pizza);
//    pizza.deliver();
//
//    System.out.println("End");