package com.stackroute.javakeywords.interfaceimplementation;

public class CarMain
{
    public static void main(String[] args)
    {
        RollsRoyce ghost = new RollsRoyce();        //object for RollsRoyce Class
        ghost.brandName();
        ghost.mileage();
        ghost.horsepower();
        Ford mustang = new Ford();                  // object for Ford Class
        mustang.brandName();
        mustang.mileage();
        mustang.horsepower();
    }
}
