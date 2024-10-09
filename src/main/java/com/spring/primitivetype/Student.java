package com.spring.primitivetype;

public class Student
{
    private int id;
    private String name;
    private double marks;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getMarks()
    {
        return marks;
    }

    public void setMarks(double marks)
    {
        this.marks = marks;
    }

    public Student()
    {
        System.out.println("Employee Constructor");
    }

    @Override
    public String toString() {
        return " -> [" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Marks=" + marks +
                ']';
    }
}
