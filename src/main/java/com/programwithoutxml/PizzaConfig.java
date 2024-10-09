package com.programwithoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.programwithoutxml")
public class PizzaConfig
{
    @Bean
    public Pepsi getPepsi()
    {
        return new Pepsi();
    }

    @Bean(name = {"a","b","c"})
    public Pizza getPizza()
    {
        return new Pizza(getPepsi());
    }

}

// Whenever we use this @Bean we can remove @ComponentScan as we are providing Bean with annotation

//@Bean
//public Pizza getPizza()
//{
//    return new Pizza();
//}