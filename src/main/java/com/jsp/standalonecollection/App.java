package com.jsp.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main(String[] args) {

        System.out.println("Start");

        ApplicationContext context=new ClassPathXmlApplicationContext("std.xml");

        Employee employee1=context.getBean("emp1", Employee.class);
        //System.out.println(employee1);

        System.out.println(employee1.getVehicle());
        System.out.println(employee1.getVehicle().getClass().getName());
        System.out.println("======================================");
        System.out.println(employee1.getName());
        System.out.println(employee1.getName().getClass().getName());
        System.out.println("======================================");
        System.out.println(employee1.getEmail());
        System.out.println(employee1.getEmail().getClass().getName());
        System.out.println("======================================");
        System.out.println(employee1.getDbProp());
        System.out.println(employee1.getDbProp().getClass().getName());

        System.out.println("End");
    }
}
