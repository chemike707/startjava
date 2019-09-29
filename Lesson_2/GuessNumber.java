import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private int compNumber;
    private String escGame = "yes";

    GuessNumberTest player = new GuessNumberTest();
    Player number = new Player();

    public void game() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        compNumber = random.nextInt(10);
        System.out.println("загаданное число - " + compNumber);
        
        do {
            System.out.println(player.player1 + " Введи число"); 
            number.setNumber(scan.nextInt());
            if(compNumber < number.getNumber()) {
                System.out.println("Загаданное число меньше");   
            } else if(compNumber > number.getNumber()) {
                System.out.println("Загаданное число больше");    
            }
            if(compNumber != number.getNumber()) {
                System.out.println(player.player2 + " Введи число");
                number.setNumber(scan.nextInt()); 
                if(compNumber < number.getNumber()) {
                    System.out.println("Загаданное число меньше");   
                } else if(compNumber > number.getNumber()) {
                    System.out.println("Загаданное число больше");    
                }   
            }
            if(compNumber == number.getNumber()) {
                System.out.println("Ты угадал");    
            }
        } while(compNumber != number.getNumber());
    }    
}