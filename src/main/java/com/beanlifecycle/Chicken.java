package com.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Chicken implements InitializingBean, DisposableBean
{
    private double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString()
    {
        return " Cost : "+cost;
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("Collecting the resources to prepare fried chicken");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("We ate the fried chicken....");
    }
}
