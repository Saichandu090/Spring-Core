package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("bean1")
public class SpElExp
{
    @Value("#{45+45}")
    private int x;

    @Value("#{88>99?9:8}")
    private int y;

    @Value("#{T(java.lang.Math).cbrt(5)}")
    private double power;

    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    public boolean isI() {
        return i;
    }

    public void setI(boolean i) {
        this.i = i;
    }

    @Value("#{5<3}")
    private boolean i;

    @Value("#{new java.lang.String('Jspiders')}")
    private String stringtype;

    @Value("#{new java.util.ArrayList()}")
    private List<String> list;

    @Override
    public String toString() {
        return "SpElExp{" +
                "x=" + x +
                ", y=" + y +
                ", power=" + power +
                ", pi=" + pi +
                ", i=" + i +
                ", stringtype='" + stringtype + '\'' +
                ", list=" + list +
                '}';
    }

    public List<String > getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String getStringtype() {
        return stringtype;
    }

    public void setStringtype(String stringtype) {
        this.stringtype = stringtype;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
