public class Jaeger { 

    private String name;
    private String launched;
    private String mark;
    private String status;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strenght;
    private int armor;
    private String weapon;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name; 
    }

    public String getLaunched() {
        return launched;
    }

    public String setLaunched(String launched) {
        return this.launched = launched; 
    }

    public String getMark() {
        return mark;
    }

    public String setMark(String mark) {
        return this.mark = mark; 
    }

    public String getStatus() {
        return status;
    }

    public String setStatus(String status) {
        return this.status = status; 
    }

    public String getOrigin() {
        return origin;
    }

    public String setOrigin(String origin) {
        return this.origin = origin; 
    }

    public double getHeight() {
        return height;
    }

    public double setHeight(int height) {
        return this.height = height; 
    }

    public double getWeight() {
        return weight;
    }

    public double setWeight(int weight) {
        return this.weight = weight; 
    }

    public int getSpeed() {
        return speed;
    }

    public int setSpeed(int speed) {
        return this.speed = speed; 
    }

    public int getStrenght() {
        return strenght;
    }

    public int setStrenght(int strenght) {
        return this.strenght = strenght; 
    }

    public int getArmor() {
        return armor;
    }

    public int setArmor(int armor) {
        return this.armor = armor; 
    }

    public String getWeapon() {
        return weapon;
    }

    public String setWeapon(String weapon) {
        return this.weapon = weapon; 
    }

    public Jaeger(String name, String launched, String mark, String status,   String origin, double height, double weight, int speed, int strenght, int y, String z) {
        this.name = name;
        this.launched = launched;
        this.mark = mark;
        this.status = status;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strenght = strenght;
        this.armor = armor;
        this.weapon = weapon;        
    }
}