package com.di.constructordi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args) {

        System.out.println("Execution Started!!");
        ApplicationContext context=new ClassPathXmlApplicationContext("constructor.xml");
        Address address=context.getBean("a1",Address.class);
        System.out.println(address);

        Dept dept=context.getBean("d1",Dept.class);
        System.out.println(dept);

        Employee employee1=context.getBean("emp1", Employee.class);
        System.out.println(employee1);
        System.out.println("Execution Terminated!!");
    }
}
