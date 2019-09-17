public class Wolf {
    
    String gender = "Мужской";
    String nickname = "Жаваед";
    float weight = 90.5f;
    int years = 15;
    String color = "Черный";

    void move() {
        System.out.println("Волк пошел");
    }

    void sit() {
        System.out.println("Волк сидит");
    }

    void run() {
        System.out.println("Волк бежит");
    }

    void howl() {
        System.out.println("Волк воет");
    }

    boolean hunt() {
        System.out.println("Волк охотится");
        return true;
    }    

}