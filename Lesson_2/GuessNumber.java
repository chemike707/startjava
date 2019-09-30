import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private int compNumber;
    private String escGame = "yes";
    private String playerOne;
    private String playerTwo;
    private int numberPlayerOne;
    private int numberPlayerTwo;

    public GuessNumber(String playerOne, String playerTwo, int numberPlayerOne, int numberPlayerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.numberPlayerOne = numberPlayerOne;
        this.numberPlayerTwo = numberPlayerTwo;
    }

    public void game() {
        Random random = new Random();
        compNumber = random.nextInt(10);
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.println(playerOne + " введи число");
            numberPlayerOne = scan.nextInt();
            if(compNumber < numberPlayerOne) {
                System.out.println("Загаданное число меньше");    
            } else if(compNumber > numberPlayerOne) {
                System.out.println("Загаданное число больше");           
            }

            if(compNumber != numberPlayerOne) {
                System.out.println(playerTwo + " введи число");
                numberPlayerTwo = scan.nextInt();
                if(compNumber < numberPlayerTwo) {
                    System.out.println("Загаданное число меньше");    
                } else if(compNumber > numberPlayerTwo) {
                    System.out.println("Загаданное число больше");           
                }
            }
            
            if(compNumber == numberPlayerOne || compNumber == numberPlayerTwo) {
                System.out.println("Ты угадал");
            } 
        } while(compNumber != numberPlayerOne & compNumber != numberPlayerTwo);
    }    
}