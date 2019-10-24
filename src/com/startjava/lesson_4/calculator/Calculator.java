package com.startjava.lesson_4.calculator;

public class Calculator {
    private String mathExpression;
    private int numberOne;
    private int numberTwo;
    private char sign;

    public Calculator(String mathExpression) {
        this.mathExpression = mathExpression;
    }

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
        String[] expressionValue = mathExpression.split(" ");
        setNumberOne(Integer.parseInt(expressionValue[0]));
        setSign((expressionValue[1]).charAt(0));
        setNumberTwo(Integer.parseInt(expressionValue[2]));

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
                break;
            default:
                System.out.println("error");
        }
    }
}
