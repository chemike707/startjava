public class Unicode {
    public static void main(String[] args) {
        char  symbol = '\u0126';
        for(char i = '\u0033'; i <= symbol; i++) {            
            System.out.println(i);
        }
    }
}