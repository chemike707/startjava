public class Calculator {
    public static void main(String[] args) {        
        double number1 = 5;
        char mathematicalOperation = '^';
        double number2 = 7;                        
        if(mathematicalOperation == '+') {
            System.out.println(number1 + number2);
        } else if(mathematicalOperation == '-') {
            System.out.println(number1 - number2);
        } else if(mathematicalOperation == '*') {
            System.out.println(number1 * number2);
        } else if(mathematicalOperation == '/') {
            System.out.println(number1 / number2);
        } else if(mathematicalOperation == '%'){
            System.out.println(number1 % number2);
        } else if(mathematicalOperation == '^') {
            double result = 1;
            for(int i = 1; i <= number2; i++) {
                result *= number1;
            }    
            System.out.println(result);
        }
    }
}