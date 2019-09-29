public class Player {

    private String nameOne;
    private String nameTwo;
    private int number;

    public Player(String nameOne, String nameTwo) {
        this.nameOne = nameOne;
        this.nameTwo = nameTwo;
    }

    public String getNameOne() {
        return nameOne;
    }

    public String getNameTwo() {
        return nameTwo;
    }

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        return this.number = number;
    }
}