import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) { 
        Calculator calculator = new Calculator();
        
        Scanner scan = new Scanner(System.in); 

        String endCalculator;
        
        do {
            System.out.println("¬ведите первое число:");
            calculator.setNumber1(scan.nextInt());
        
            System.out.println("¬ведите знак математической операции:");
            System.out.println(calculator.setSign('^'));

            System.out.println("¬ведите второе число:");
            calculator.setNumber2(scan.nextInt());
           
            calculator.calculate(); 

            do {
                System.out.println("’отите продолжить? [да/нет]: ");
                endCalculator = scan.next();
                if(endCalculator.equals("нет")) {
                break;
                }
            } while(!endCalculator.equals("да"));   

        } while(endCalculator.equals("да"));
    }   
}

