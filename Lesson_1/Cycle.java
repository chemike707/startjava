public class Cycle {
    public static void main(String[] args) {    
        for(int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        int i = 6;
        while(i >= -6) {            
            System.out.println(i);
            i = i - 2;
        }
        int j = 11;
        int result = 0;
        do {
            result = result + j;
            j = j + 2;
        } while (j < 20);
        System.out.println("11 + 13 + 15 + 17 + 19 = " + result);    
        
    }
}