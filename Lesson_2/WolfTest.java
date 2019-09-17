public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        System.out.println("Кличка = " + wolfOne.nickname);
        System.out.println("Пол = " + wolfOne.gender);
        System.out.println("Возраст = " + wolfOne.years);
        System.out.println(wolfOne.hunt());
    }
}