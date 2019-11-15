package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNumber;

    public Player(String name) {
        this.name = name;
        enteredNumber = new int[10];
    }

    public String getName() {
        return name;
    }

    public int getEnteredNumber(int index) {
        return enteredNumber[index];
    }

    public int[] getNumbers(int index) {
        return Arrays.copyOf(enteredNumber, index);
    }

    public void setEnteredNumber(int index, int number) {
        this.enteredNumber[index] = number;
    }
}

