package com.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Gta {
    private String car;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString()
    {
        return "Car : "+car;
    }

    @PostConstruct
    public void start()
    {
        System.out.println("Started Racing!!");
    }

    @PreDestroy
    public void stop()
    {
        System.out.println("Ended Racing....");
    }
}

