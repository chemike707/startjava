package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.println("Компьютер загадал число от 0 до 100 \nПопробуй угадать");
        
        System.out.println("Введите имя первого игрока:");
        Player playerOne = new Player(scan.next());

        System.out.println("Введите имя второго игрока:");
        Player playerTwo = new Player(scan.next());

        String escGame = "yes";
        do {
            GuessNumber game = new GuessNumber(playerOne, playerTwo);
            game.startGame();
            do {
                System.out.println("Хотите продолжить? [yes/no]: ");
                escGame = scan.next();
            } while(!escGame.equals("yes") && !escGame.equals("no"));
        } while(escGame.equals("yes"));
    }    
}