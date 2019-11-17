package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private Player playerOne;
    private Player playerTwo;
    private int compNumber;

    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
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

            if(makeMove(playerOne, i)) {
                break;
            }
            if(makeMove(playerTwo, i)) {
                break;
            }
        }
    }

    private boolean makeMove(Player player, int index) {
        enterNumber(player, index);
        return checkNumber(player, index);
    }

    private void enterNumber(Player player, int index) {
        System.out.println(player.getName() + " введи число");
        player.setEnteredNumber(index, scan.nextInt());
    }

    private boolean checkNumber(Player player, int index) {
        if(compNumber == player.getEnteredNumber(index)) {
            System.out.println("игрок " + player.getName() + " угадал число " + player.getEnteredNumber(index) + " c " + (index + 1) + " попытки");
            System.out.println(playerOne.getName() + " " + Arrays.toString(playerOne.getNumbers(index + 1)));
            System.out.println(playerTwo.getName() + " " + Arrays.toString(playerTwo.getNumbers(index + 1)));
            return true;
        } else if(compNumber <  player.getEnteredNumber(index)) {
            System.out.println("Загаданное число меньше");
        } else {
            System.out.println("Загаданное число больше");
        }
        return false;
    }
}
