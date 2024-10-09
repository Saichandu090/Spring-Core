package com.spring.referencetype;

public class Son
{
    private int x;
    private Father father;

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public Father getFather()
    {
        return father;
    }

    public void setFather(Father father)
    {
        this.father = father;
    }

    @Override
    public String toString()
    {
        return "-> [" +
                "X=" + x +
                ", Father ->" + father +
                ']';
    }
}
