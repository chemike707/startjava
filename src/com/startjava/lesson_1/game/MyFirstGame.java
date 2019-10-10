package com.startjava.lesson_1.game;

public class MyFirstGame {
    public static void main(String[] args) {
        int randomNumber = 37;
        int inputNumber = 54;        
        if(inputNumber < randomNumber) {
            for(int i = inputNumber; i <= randomNumber; i++) {
                inputNumber = i;
                if(inputNumber < randomNumber) {
                    System.out.println("Загаданное число больше " + i); 
                } else if(inputNumber == randomNumber) {
                    System.out.println("Загаданное число " + i);
                } 
            }           
        } else if(inputNumber > randomNumber) {  
            for(int i = inputNumber; i >= randomNumber; i--) {
                inputNumber = i;
                if(inputNumber > randomNumber) {
                    System.out.println("Загаданное число меньше " + i); 
                } else if(inputNumber == randomNumber) {
                    System.out.println("Загаданное число " + i);
                } 
            } 
        }  
    }
}