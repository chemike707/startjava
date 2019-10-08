public class Player {

    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
        number = -1;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        return this.number = number;
    }
}