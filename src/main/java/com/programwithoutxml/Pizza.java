package com.programwithoutxml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component("firstpizza")
public class Pizza
{
    private Pepsi pespi;

    void deliver()
    {
        System.out.println("Deliver my pizza..! I'm very Hungry");
        pespi.drink();
    }

    public Pepsi getPespi() {
        return pespi;
    }

    public void setPespi(Pepsi pespi) {
        this.pespi = pespi;
    }

    Pizza(Pepsi pespi)
    {
        this.pespi=pespi;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pespi=" + pespi +
                '}';
    }
}
