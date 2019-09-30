import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока:");
        Player playerOne = new Player(scan.next());

        System.out.println("Введите имя второго игрока:");
        Player playerTwo = new Player(scan.next());

        String escGame = "yes";
        do {
            GuessNumber game = new GuessNumber(playerOne.getName(), playerTwo.getName(), playerOne.getNumber(), playerTwo.getNumber());
            game.game();
            do {
                System.out.println("Хотите продолжить? [да/нет]: ");
                escGame = scan.next();
            } while(!escGame.equals("yes") & !escGame.equals("no"));
        } while(escGame.equals("yes"));





       








        // Player player = new Player("Mike", "John");
        // System.out.println("компьтер загадал число от 1 до 10, попробуй его угадать");

        
        
    }    
}