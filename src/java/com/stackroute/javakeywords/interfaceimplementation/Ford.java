package com.stackroute.javakeywords.interfaceimplementation;

public class Ford implements Car
{
    @Override
    public void brandName()         //overriding method from interface
    {
        System.out.println("This is Ford Mustang");
    }

    @Override
    public void mileage()           //overriding method from interface
    {
        System.out.println("Mileage = 12 KM/L");
    }

    @Override
    public void horsepower()        //overriding method from interface
    {
        System.out.println("HorsePower = 650");
    }
}
