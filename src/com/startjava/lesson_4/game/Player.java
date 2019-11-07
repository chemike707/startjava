package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] enteredNumbers;

    public Player(String name) {
        this.name = name;
        number = -1;
        enteredNumbers  = new int[10];
    }

    public int[] getNumbers(int index) {
        return Arrays.copyOf(enteredNumbers, index + 1);
    }

    public void setEnteredNumbers(int i) {
        enteredNumbers[i] = number;
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

