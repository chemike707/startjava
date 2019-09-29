public class GuessNumberTest {

    public static void main(String[] args) { 
        Player player = new Player("Mike", "John");
        System.out.println("имя первого игрока - " + player.getNameOne());
        System.out.println("имя второго игрока - " + player.getNameTwo());
        System.out.println("компьтер загадал число от 1 до 10, попробуй его угадать");

        
        GuessNumber game = new GuessNumber();
        game.game();
    }    
}