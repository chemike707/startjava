import java.util.Scanner;

public class GuessNumberTest {
    static String player1, player2;    

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока:");
        Player playerOne = new Player();
        playerOne.setName(scan.next());
        player1 = playerOne.getName();
        
        System.out.println("Введите имя второго игрока:");
        Player playerTwo = new Player();
        playerTwo.setName(scan.next());
        player2 = playerTwo.getName();

        String escGame = "yes";
        do {
            do {
                GuessNumber game = new GuessNumber();
                game.game();
                System.out.println("Хотите продолжить? [да/нет]: ");
                escGame = scan.next();
            } while(!escGame.equals("yes") & !escGame.equals("no"));
        } while(escGame.equals("yes"));





       








        // Player player = new Player("Mike", "John");
        // System.out.println("компьтер загадал число от 1 до 10, попробуй его угадать");

        
        
    }    
}