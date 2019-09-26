public class Calculator { 

    private char sign;
    private int number1; 
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public char getSign() {
        return sign;
    }

    public char setSign(char sign) {
        return this.sign = sign;
    }

    public void calculate() {
        switch(sign) {
            case '+':   
                System.out.println(number1 + number2);
                break; 
            case '-':   
                System.out.println(number1 - number2);
                break;
            case '*':   
                System.out.println(number1 * number2);
                break;
            case '/':   
                System.out.println(number1 / number2);
                break;
            case '%':   
                System.out.println(number1 % number2);
                break;
            case '^':   
                int result = 1;
                for(int i = 1; i <= number2; i++) {
                    result *= number1;
                }
                System.out.println(result);
        }
    }
}
