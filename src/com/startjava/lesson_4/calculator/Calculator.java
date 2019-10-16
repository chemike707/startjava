package com.startjava.lesson_4.calculator;

public class Calculator {
    private int numberOne;
    private int numberTwo;
    private char sign;

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }


    public void calculate() {
        switch(sign) {
            case '+':
                System.out.println(numberOne + numberTwo);
                break;
            case '-':
                System.out.println(numberOne - numberTwo);
                break;
            case '*':
                System.out.println(numberOne * numberTwo);
                break;
            case '/':
                System.out.println(numberOne / numberTwo);
                break;
            case '%':
                System.out.println(numberOne % numberTwo);
                break;
            case '^':
                System.out.println(Math.pow(numberOne, numberTwo));

        }
    }
}
