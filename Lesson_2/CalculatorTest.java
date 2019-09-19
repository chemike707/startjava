import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) { 
        Calculator calculator1 = new Calculator();  
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите первое число");
        calculator1.setNumber1(scan.nextInt());
        
        System.out.println("Введите знак математической операции:");
        System.out.println(calculator1.setSign('^'));

        System.out.println("Введите второе число число");
        calculator1.setNumber2(scan.nextInt());
        
        calculator1.sw();
    }    
}

