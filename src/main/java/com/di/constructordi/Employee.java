package com.di.constructordi;

public class Employee
{
    private int id;
    private String name;
    private Address address;
    private Dept dname;

    public Employee(int id, String name, Address address,Dept dname)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dname=dname;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "Id=" + id +
                ", Name='" + name + '\'' +
                ", Address=" + address +
                ", Dname=" + dname +
                ']';
    }
}
