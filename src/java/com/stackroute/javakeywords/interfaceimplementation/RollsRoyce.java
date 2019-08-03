package com.stackroute.javakeywords.interfaceimplementation;

public class RollsRoyce implements Car
{
    @Override
    public void brandName()         //overriding method from interface
    {
        System.out.println("This is Rolls Royce Ghost");
    }

    @Override
    public void mileage()           //overriding method from interface
    {
        System.out.println("Mileage = 8 KM/L");
    }

    @Override
    public void horsepower()        //overriding method from interface
    {
        System.out.println("HorsePower = 500 HP \n");
    }

}
