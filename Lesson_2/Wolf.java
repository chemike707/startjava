public class Wolf {
    
    private String gender = "Мужской";
    private String nickname = "Жаваед";
    private float weight = 90.5f;
    private int age = 7;
    private String color = "Черный";

    public String getGender() {
        return gender;
    }

    public String getNickname() {
        return nickname;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

     public String getColor() {
        return color;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setNickname(String nickname) {
        this.nickname = nickname;
    }

    void setWeight(float weight) {
        this.weight = weight;
    }

     void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {            
            this.age = age;
        }
    }

     void setColor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Волк пошел");
    }

    public void sit() {
        System.out.println("Волк сидит");
    }

    public void run() {
        System.out.println("Волк бежит");
    }

    public void howl() {
        System.out.println("Волк воет");
    }

    public boolean hunt() {
        System.out.println("Волк охотится");
        return true;
    }    

}