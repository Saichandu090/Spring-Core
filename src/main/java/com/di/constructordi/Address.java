package com.di.constructordi;

public class Address
{
    public Address(int pincode, String city, String state) {
        this.pincode = pincode;
        this.city = city;
        this.state = state;
    }

    private int pincode;
   private String city;
   private String state;

    @Override
    public String toString() {
        return "-> [" +
                "Pincode=" + pincode +
                ", City='" + city + '\'' +
                ", State='" + state + '\'' +
                ']';
    }
}
