package com.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student
{
    @Qualifier("cer2")
    @Autowired
    private Certificate certi;

    public Certificate getCerti()
    {
        return certi;
    }


    public void setCerti(Certificate certi)
    {
        this.certi = certi;
        System.out.println("Injecting certi Using Setter");
    }

    public Student(Certificate certi)
    {
        this.certi = certi;
        System.out.println("Injecting using constructor");
    }

    public Student()
    {
    }

    @Override
    public String toString() {
        return "Student{" +
                "certi=" + certi +
                '}';
    }
}
