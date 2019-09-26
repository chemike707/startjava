import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) { 
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in); 
        String escCalculator;
        
        do {
            System.out.println("Введите первое число:");
            calculator.setNumber1(scan.nextInt());
        
            System.out.println("Введите знак математической операции:");
            System.out.println(calculator.setSign('^'));

            System.out.println("Введите второе число:");
            calculator.setNumber2(scan.nextInt());
           
            calculator.calculate(); 

            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                escCalculator = scan.next();
            } while(!escCalculator.equals("yes") & !escCalculator.equals("no"));   
        } while(escCalculator.equals("yes"));
    }   
}

