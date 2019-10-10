package com.startjava.lesson_1.cycle;

public class Cycle {
    public static void main(String[] args) {    
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        
        int counter = 6;
        while(counter >= -6) {            
            System.out.println(counter);
            counter -= 2;
        }
        
        int j = 10;
        int sumOdd = 0;
        do {
            if(j % 2 == 0) {          
                j++;
            } else {
                sumOdd += j; 
                j++;   
            }            
        } while (j <= 20);
        System.out.println("11 + 13 + 15 + 17 + 19 = " + sumOdd);         
    }
}