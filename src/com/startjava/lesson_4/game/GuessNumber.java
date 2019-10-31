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

        System.out.println("У вас 10 попыток");

        for(int i = 0; i < 11; i++) {
            if(i > 9) {
                System.out.println("У " + playerOne.getName() + " закончились попытки: " + Arrays.toString(playerOne.getNumbers()));
                System.out.println("У " + playerTwo.getName() + " закончились попытки: " + Arrays.toString(playerTwo.getNumbers()));
                Arrays.fill(playerOne.getNumbers(), 0, i, 0);
                Arrays.fill(playerTwo.getNumbers(), 0, i, 0);
                break;
            }

            if (compNumber != playerOne.getNumber()) {
                System.out.println(playerOne.getName() + " введи число");
                playerOne.setNumber(scan.nextInt());

                playerOne.setNumbers(i);
                System.out.println(Arrays.toString(playerOne.getNumbers()));

                if(compNumber < playerOne.getNumber()) {
                    System.out.println("Загаданное число меньше");
                } else if(compNumber > playerOne.getNumber()) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("игрок " + playerOne.getName() + " угадал число " + playerOne.getNumber() + " c " + (i + 1) + " попытки");
                    Arrays.fill(playerOne.getNumbers(), 0, i, 0);
                    break;
                }
            }

            if(compNumber != playerTwo.getNumber()) {
                System.out.println(playerTwo.getName() + " введи число");
                playerTwo.setNumber(scan.nextInt());

                playerTwo.setNumbers(i);
                System.out.println(Arrays.toString(playerTwo.getNumbers()));

                if(compNumber < playerTwo.getNumber()) {
                    System.out.println("Загаданное число меньше");
                } else if(compNumber > playerTwo.getNumber()) {
                    System.out.println("Загаданное число больше");
                } else {
                    System.out.println("игрок " + playerTwo.getName() + " угадал число " + playerTwo.getNumber() + " c " + (i + 1) + " попытки");
                    Arrays.fill(playerTwo.getNumbers(), 0, i, 0);
                    break;
                }
            }
        }
    }
}
