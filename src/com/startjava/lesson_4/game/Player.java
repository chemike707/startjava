package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] enteredNumber;

    public Player(String name) {
        this.name = name;
        number = -1;
        enteredNumber = new int[10];
    }

    public int[] getNumbers(int index) {
        return Arrays.copyOf(enteredNumber, index + 1);
    }

    public void setEnteredNumber(int index) {
        enteredNumber[index] = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
       this.number = number;
    }
}

