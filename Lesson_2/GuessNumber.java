import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int compNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        Random random = new Random();
        compNumber = random.nextInt(101);
        Scanner scan = new Scanner(System.in);
        
        do {
            if(compNumber != playerOne.getNumber()) {
                System.out.println(playerOne.getName() + " введи число");
                playerOne.setNumber(scan.nextInt());
                if(compNumber < playerOne.getNumber()) {
                    System.out.println("Загаданное число меньше");    
                } else if(compNumber > playerOne.getNumber()) {
                    System.out.println("Загаданное число больше");           
                } else {
                    break;
                }
            }

            if(compNumber != playerTwo.getNumber()) {
                System.out.println(playerTwo.getName() + " введи число");
                playerTwo.setNumber(scan.nextInt());
                if(compNumber < playerTwo.getNumber()) {
                    System.out.println("Загаданное число меньше");    
                } else if(compNumber > playerTwo.getNumber()) {
                    System.out.println("Загаданное число больше");           
                } else {
                    break;
                }
            }
        } while(true);
        System.out.println("Ты угадал");
    }    
}