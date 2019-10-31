package com.startjava.lesson_4.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String escCalculator;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите математическое выражение: ");

            Calculator calculator = new Calculator(scan.nextLine());
            calculator.calculate();

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                escCalculator = scan.next();
            } while(!escCalculator.equals("yes") && !escCalculator.equals("no"));
        } while (escCalculator.equals("yes"));
    }
}
