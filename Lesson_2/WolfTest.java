public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Женский");
        wolfOne.setNickname("Жаваедка");
        wolfOne.setWeight(48);
        wolfOne.setAge(8);
        wolfOne.setColor("Белый");
        
        System.out.println(wolfOne.getGender());
        System.out.println(wolfOne.getNickname());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getColor());
    }
}