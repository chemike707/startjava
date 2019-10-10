package com.startjava.lesson_1.calculator;

public class Calculator {
    public static void main(String[] args) {        
        double number1 = 5.4;
        char sign = '^';
        double number2 = 2;
                                
        if(sign == '+') {
            System.out.println(number1 + number2);
        } else if(sign == '-') {
            System.out.println(number1 - number2);
        } else if(sign == '*') {
            System.out.println(number1 * number2);
        } else if(sign == '/') {
            System.out.println(number1 / number2);
        } else if(sign == '%'){
            System.out.println(number1 % number2);
        } else if(sign == '^') {
            double result = 1;
            for(int i = 1; i <= number2; i++) {
                result *= number1;
            }    
            System.out.println(result);
        }
    }
}