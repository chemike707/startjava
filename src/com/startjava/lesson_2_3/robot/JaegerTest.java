package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) { 
        Jaeger jaegerOne = new Jaeger("Crimson Typhoon", "August 22, 2018", "Mark-4", "Destroyed", "China", 76.2, 1.722, 9, 9, 6, "IB22 Plasmacaster");
        System.out.println("Launched - " + jaegerOne.getLaunched());
        System.out.println("Name - " + jaegerOne.getName());
        System.out.println("Status - " + jaegerOne.getStatus());
        System.out.println("Height - " + jaegerOne.getHeight() + " m");
        System.out.println("Weight - " + jaegerOne.getWeight() + " tons");

        Jaeger jaegerTwo = new Jaeger("Coyote Tango", "December 30th, 2015", "Mark-1", "Destroyed", "Japan", 85.34, 2.312, 5, 7, 4, "Ballistic mortar cannons V-PI EnergyCaster");
        System.out.println("Launched - " + jaegerTwo.getLaunched());
        System.out.println("Name - " + jaegerTwo.getName());
        System.out.println("Status - " + jaegerTwo.getStatus());
        System.out.println("Height - " + jaegerTwo.getHeight() + " m");
        System.out.println("Weight - " + jaegerTwo.getWeight() + " tons");
    }   
}

 