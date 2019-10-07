import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        Player playerOne = new Player(scan.next(), 0);

        System.out.println("Введите имя второго игрока:");
        Player playerTwo = new Player(scan.next(), 0);

        String escGame = "yes";
        do {
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.game();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                escGame = scan.next();
            } while(!escGame.equals("yes") & !escGame.equals("no"));
        } while(escGame.equals("yes"));
    }    
}