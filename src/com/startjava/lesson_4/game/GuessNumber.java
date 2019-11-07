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

    public void numberCheck(int playerNumber) {
        if(compNumber < playerNumber) {
            System.out.println("Загаданное число меньше");
        } else if(compNumber > playerNumber) {
            System.out.println("Загаданное число больше");
        }
    }

    public void enterNumber(String name, Player number) {
        Scanner scan = new Scanner(System.in);
        System.out.println(name + " введи число");
        number.setNumber(scan.nextInt());
    }

    public void startGame() {
        Random random = new Random();
        compNumber = random.nextInt(101);

        System.out.println("У вас 10 попыток");

        for(int i = 0; i < 11; i++) {
            if(i > 9) {
                System.out.println("У " + playerOne.getName() + " закончились попытки: " + Arrays.toString(playerOne.getNumbers(i)));
                System.out.println("У " + playerTwo.getName() + " закончились попытки: " + Arrays.toString(playerTwo.getNumbers(i)));
                Arrays.fill(playerOne.getNumbers(i), 0, i, 0);
                Arrays.fill(playerTwo.getNumbers(i), 0, i, 0);
                break;
            }

            if (compNumber != playerOne.getNumber()) {
                enterNumber(playerOne.getName(), playerOne);

                playerOne.setEnteredNumbers(i);

                numberCheck(playerOne.getNumber());

                if(compNumber == playerOne.getNumber()){
                    System.out.println("игрок " + playerOne.getName() + " угадал число " + playerOne.getNumber() + " c " + (i + 1) + " попытки");
                    Arrays.fill(playerOne.getNumbers(i), 0, i, 0);
                    break;
                }
            }

            if(compNumber != playerTwo.getNumber()) {
                enterNumber(playerTwo.getName(), playerTwo);

                playerTwo.setEnteredNumbers(i);

                numberCheck(playerTwo.getNumber());

                if(compNumber == playerTwo.getNumber()) {
                    System.out.println("игрок " + playerTwo.getName() + " угадал число " + playerTwo.getNumber() + " c " + (i + 1) + " попытки");
                    Arrays.fill(playerTwo.getNumbers(i), 0, i, 0);
                    break;
                }
            }
        }
    }
}
