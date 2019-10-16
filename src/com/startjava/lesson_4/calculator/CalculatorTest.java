package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String escCalculator;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите математическое выражение: ");

            String string = scan.nextLine();
            String[] mathOperation = string.split(" ");

            Calculator calculator = new Calculator();

            calculator.setNumberOne(Integer.parseInt(mathOperation[0]));
            calculator.setSign(mathOperation[1].charAt(0));
            calculator.setNumberTwo(Integer.parseInt(mathOperation[2]));

            calculator.calculate();

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                escCalculator = scan.next();
            } while(!escCalculator.equals("yes") & !escCalculator.equals("no"));
        } while (escCalculator.equals("yes"));
    }
}
