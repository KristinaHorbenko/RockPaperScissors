package org.example;

import java.util.Scanner;

public class Player {

    private static int playerMove;
    static Scanner scanner = new Scanner(System.in);

    public static Move getPlayerMove() {
        System.out.println("Виберіть свій хід: ");
        System.out.println("1. Камінь");
        System.out.println("2. Папір");
        System.out.println("3. Ножиці");
        System.out.println("4. Закінчити гру");


        playerMove = scanner.nextInt();


        switch (playerMove) {
            case 1:
                System.out.println("Ви обрали: Камінь");
                ChoiceSlector.printRock();
                return Move.ROCK;
            case 2:
                System.out.println("Ви обрали: Папір");
                ChoiceSlector.printPaper();
                return Move.PAPER;
            case 3:
                System.out.println("Ви обрали: Ножиці");
                ChoiceSlector.printScissors();
                return Move.SCISSORS;
            case 4:
                System.exit(0);
            default:
                System.out.println("Невірний вибір! Обирайте знову.");
                return getPlayerMove();
            }
        }


    }
