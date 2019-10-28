package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int compNumber;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void startGame() {
        Random random = new Random();
        compNumber = random.nextInt(11);
        Scanner scan = new Scanner(System.in);

            int[] numOne = new int[10];
            int[] numTwo = new int[10];

                do {

                    for(int i = 0; i < 10; i++) {

                        if (compNumber != playerOne.getNumber()) {
                            System.out.println(playerOne.getName() + " введи число");
                            playerOne.setNumber(scan.nextInt());

                            numOne[i] = playerOne.getNumber();
                            playerOne.setNumbers(Arrays.copyOf(numOne, i + 1));

                            if(compNumber < playerOne.getNumber()) {
                                System.out.println("Загаданное число меньше");
                            } else if(compNumber > playerOne.getNumber()) {
                                System.out.println("Загаданное число больше");
                            } else {
                                System.out.println("игрок " + playerOne.getName() + " угадал число " + playerOne.getNumber() + " c " + (i + 1) + " попытки");
                                System.out.println(Arrays.toString(playerOne.getNumbers()));
                                break;
                            }
                        }

                        if(compNumber != playerTwo.getNumber()) {
                            System.out.println(playerTwo.getName() + " введи число");
                            playerTwo.setNumber(scan.nextInt());

                            numTwo[i] = playerTwo.getNumber();
                            playerTwo.setNumbers(Arrays.copyOf(numTwo, i + 1));

                            if(compNumber < playerTwo.getNumber()) {
                                System.out.println("Загаданное число меньше");
                            } else if(compNumber > playerTwo.getNumber()) {
                                System.out.println("Загаданное число больше");
                            } else {
                                System.out.println("игрок " + playerTwo.getName() + " угадал число " + playerTwo.getNumber() + " c " + (i + 1) + " попытки");
                                System.out.println(Arrays.toString(playerTwo.getNumbers()));
                                break;
                            }
                        }
                    }
                    break;
                } while (true);

    }
}
