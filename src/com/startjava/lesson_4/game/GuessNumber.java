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

    private Scanner scan = new Scanner(System.in);

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

            verification(playerOne, i);

            numberAttempts(playerOne, i);

            verification(playerTwo, i);

            numberAttempts(playerTwo, i);

        }
    }

    private void enterNumber(Player number) {
        System.out.println(number.getName() + " введи число");
        number.setNumber(scan.nextInt());
    }

    private void guessingHelp(int playerNumber) {
        if(compNumber < playerNumber) {
            System.out.println("Загаданное число меньше");
        } else if(compNumber > playerNumber) {
            System.out.println("Загаданное число больше");
        }
    }

    private void verification(Player player, int index) {
        if(compNumber != player.getNumber()) {
            enterNumber(player);
            guessingHelp(player.getNumber());
            player.setEnteredNumber(index);
        }
    }

    private void numberAttempts(Player player, int index) {
        if(compNumber == player.getNumber()) {
            System.out.println("игрок " + player.getName() + " угадал число " + player.getNumber() + " c " + (index + 1) + " попытки");
            Arrays.fill(player.getNumbers(index), 0, index, 0);
        }
    }
}
