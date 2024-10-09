package com.di.constructordi;

public class Dept
{
    private String dname;

    Dept(String dname)
    {
        this.dname=dname;
    }

    @Override
    public String toString() {
        return "-> [" +
                "Dept : " + dname + '\'' +
                ']';
    }
}
