package com.startjava.lesson_2_3.person;

public class Person {
    
    String name = "иван";
    String surname = "иванов";
    String patronymic = "иванович";
    float height = 180.3f;
    float weight = 79.5f;
    float sizeShoe = 43.5f;

    boolean sit() {
        System.out.println("иваныч сел");
        return true;
    }

    void move() {
        System.out.println("иваныч прошел 0 шагов");
    }

    void run()  {

    }

    boolean speek() {
        return true;
    }

    boolean javaLearn() {
        return true;
    }

}