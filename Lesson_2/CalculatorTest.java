import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) { 
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in); 
      
        String endCalculator;
        do {
            calculator.calculate(); 
            System.out.println("Хотите продолжить? [да/нет]:");
            endCalculator = scan.next(); 
        } while (endCalculator == "да");
        if(endCalculator != "да") {
            System.out.println("Хотите продолжить? [да/нет]:");
        }
    }   
}

