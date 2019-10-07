import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int number = 101;
    private int compNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void game() {
        Random random = new Random();
        compNumber = random.nextInt(100);
        Scanner scan = new Scanner(System.in);
        do {
            if(compNumber != number) {
                System.out.println(playerOne.getName() + " введи число");
                number = playerOne.setNumber(scan.nextInt());
                if(compNumber < number) {
                    System.out.println("Загаданное число меньше");    
                } else if(compNumber > number) {
                    System.out.println("Загаданное число больше");           
                }
            }

            if(compNumber != number) {
                System.out.println(playerTwo.getName() + " введи число");
                number = playerTwo.setNumber(scan.nextInt());
                if(compNumber < number) {
                    System.out.println("Загаданное число меньше");    
                } else if(compNumber > number) {
                    System.out.println("Загаданное число больше");           
                }
            }
        } while(compNumber != number);
        System.out.println("Ты угадал");
    }    
}