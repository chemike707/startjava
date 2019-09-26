import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        Player playerOne = new Player();
        System.out.println("Enter the name of the first player");
        playerOne.setName(scan.next());

        Player playerTwo = new Player();
        System.out.println("Enter the name of the second player");
        playerTwo.setName(scan.next());
        
        System.out.println("Сomputer made up a number from 1 to 10");
        System.out.println("Try to guess it");

        GuessNumber guessNumber = new GuessNumber();

        Random random = new Random();
        guessNumber.setCompNumber(random.nextInt(100));

        String escGame = "yes";
        do {
            System.out.println(playerOne.getName() + " enter number");
            guessNumber.setNumberOne(scan.nextInt());
            guessNumber.game();
            
            if(guessNumber.getNumberOne() != guessNumber.getCompNumber()) {
                System.out.println(playerTwo.getName() + " enter number");
                guessNumber.setNumberOne(scan.nextInt());
                guessNumber.game();
                }

            if(guessNumber.getNumberOne() == guessNumber.getCompNumber()) {
                guessNumber.setCompNumber(random.nextInt(100));
                do {
                    System.out.println("Хотите продолжить? [да/нет]: ");
                    escGame = scan.next();
                } while(!escGame.equals("yes") & !escGame.equals("no")); 
            }
        } while(escGame.equals("yes"));
    }    
}