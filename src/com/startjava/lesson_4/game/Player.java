package com.startjava.lesson_4.game;

public class Player {

    private String name;
    private int number;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
        number = -1;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
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

