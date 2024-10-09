package com.di.multipleconstructor;

public class Test
{
    private int x;
    private int y;



    Test(double x,double y)
    {
        this.x=(int)x;
        this.y=(int)y;
        System.out.println("Double Constructor");
    }

    Test(int x,int y)
    {
        this.x=x;
        this.y=y;
        System.out.println("int constructor");
    }

    Test(String x,String y)
    {
        this.x=Integer.parseInt(x);
        this.y=Integer.parseInt(y);
        System.out.println("String Constructor");
    }


    public void add()
    {
        System.out.println("Value of X is "+this.x);
        System.out.println("Value of Y is "+this.y);
        System.out.println("Addition : "+(this.x+this.y));
    }

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
