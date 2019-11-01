package com.startjava.lesson_4.game;

import java.util.Arrays;

public class Player {

    private String name;
    private int number;
    private int[] enteredNumbers ;

    public Player(String name) {
        this.name = name;
        number = -1;
        enteredNumbers  = new int[10];
    }

    public int[] getNumbers() {
        return Arrays.copyOf(enteredNumbers, enteredNumbers.length);
    }

    public void setNumbers(int i) {
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

