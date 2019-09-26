public class GuessNumber {

    private int numberOne;
    private int compNumber;
    
    public int getNumberOne() {
        return numberOne;
    }

    public int setNumberOne(int numberOne) {
        return this.numberOne = numberOne;
    }

    public int getCompNumber() {
        return compNumber;
    }

    public int setCompNumber(int compNumber) {
        return this.compNumber = compNumber;
    }

    public void game() {
            if(compNumber < numberOne) {
                System.out.println("Загаданное число меньше");
            } 
            else if(numberOne < compNumber) {
                System.out.println("Загаданное число больше");   
            } 
            else {
                System.out.println("Ты угадал ублюдок, загаданное число " + compNumber);
            } 
    }
}