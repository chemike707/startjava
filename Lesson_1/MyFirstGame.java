public class MyFirstGame {
    public static void main(String[] args) {
        int madeUp = 37;
        int guessed = 54;        
        if(guessed < madeUp) {
            for(int i = guessed; i <= madeUp; i++) {
                guessed = i;
                if(guessed < madeUp) {
                    System.out.println("Загаданное число больше " + i); 
                } else if(guessed == madeUp) {
                    System.out.println("Загаданное число " + i);
                } 
            }           
        } else if(guessed > madeUp) {  
            for(int i = guessed; i >= madeUp; i--) {
                guessed = i;
                if(guessed > madeUp) {
                    System.out.println("Загаданное число меньше " + i); 
                } else if(guessed == madeUp) {
                    System.out.println("Загаданное число " + i);
                } 
            } 
        }  
    }
}