public class Calculator {
    public static void main(String[] args) {
        
        double chislo1 = 5;
        double chislo2 = 3;
        char znak = '*';        
        char plus, minus, umnojenie, delenie, stepen, delenie_po_modulu;
        plus = '+';
        minus = '-';
        umnojenie = '*';
        delenie = '/';
        stepen = '^';
        delenie_po_modulu = '%';
                
        if(znak == plus) {
            System.out.println(chislo1 + chislo2);
        } else if(znak == minus) {
            System.out.println(chislo1 - chislo2);
        } else if(znak == umnojenie) {
            System.out.println(chislo1 * chislo2);
        } else if(znak == delenie) {
            System.out.println(chislo1 / chislo2);
        } else if(znak == stepen) {
            System.out.println(chislo1 * chislo1);
        } else {
            System.out.println(chislo1 % chislo2);
        }
        
        
        

    }
}