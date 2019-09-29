import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private int compNumber;
    private String escGame = "yes";

    Player player = new Player("Mike", "John");

    public void game() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        compNumber = random.nextInt(10);
        
        do {           
            System.out.println(player.getNameOne() + " введи число");
            player.setNumber(scan.nextInt());
            if(compNumber < player.getNumber()) {
                System.out.println("Загаданное число меньше");    
            } else if(compNumber > player.getNumber()) {
                System.out.println("Загаданное число больше");    
            }
            
            if(compNumber != player.getNumber()) {
                System.out.println(player.getNameTwo() + " введи число");
                player.setNumber(scan.nextInt());    
            }

            if(compNumber < player.getNumber()) {
                System.out.println("Загаданное число меньше");    
            } else if(compNumber > player.getNumber()) {
                System.out.println("Загаданное число больше");    
            } else {
                System.out.println("Поздравляю, ты угадал");
                compNumber = random.nextInt(10);
                do {
                    System.out.println("Хотите продолжить? [да/нет]: ");
                    escGame = scan.next();
                } while(!escGame.equals("yes") & !escGame.equals("no"));            
            }
        } while(escGame.equals("yes"));
    }    
}