package com.spring.referencetype;

public class Father
{
    private int y;

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "[" +
                "Y=" + y +
                ']';
    }
}
