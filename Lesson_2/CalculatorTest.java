import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) { 
        Calculator calculator = new Calculator();
        
        Scanner scan = new Scanner(System.in); 

        String endCalculator;
        
        do {
            System.out.println("������� ������ �����:");
            calculator.setNumber1(scan.nextInt());
        
            System.out.println("������� ���� �������������� ��������:");
            System.out.println(calculator.setSign('^'));

            System.out.println("������� ������ �����:");
            calculator.setNumber2(scan.nextInt());
           
            calculator.calculate(); 

            do {
                System.out.println("������ ����������? [��/���]: ");
                endCalculator = scan.next();
                if(endCalculator.equals("���")) {
                break;
                }
            } while(!endCalculator.equals("��"));   

        } while(endCalculator.equals("��"));
    }   
}

