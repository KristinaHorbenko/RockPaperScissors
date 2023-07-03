package org.example;

import java.util.Scanner;

import static org.example.Computer.getComputerMove;
import static org.example.Player.getPlayerMove;

public class GameService {
    private static String name;
    private static int totalGames;
    private static int gamesPlayed = 0;
    private static int playerScore = 0;
    private static int computerScore = 0;
    private static int drawGame = 0;


    public static void playGame() {
        System.out.println("Вітаємо у грі \"Камінь, ножиці, папір\"!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");

        name = scanner.nextLine();
        System.out.println("Вітаємо, у грі " + name + "!");
        System.out.print(name + ", Введіть кількість ігор: ");
        totalGames = scanner.nextInt();
        if (totalGames <= 0) {
            System.out.println("Невірна кількість ігор! Будь ласка, введіть додатне ціле число.");


        }
        while (gamesPlayed < totalGames) {

            gamesPlayed++;

            Move playerMove = getPlayerMove();
            Move computerMove = getComputerMove();


            int compareMoves = playerMove.compareMoves(computerMove);

            switch (compareMoves) {
                case 0:
                    System.out.println("Нічья");
                    drawGame++;
                    break;
                case 1:
                    System.out.println("Ви перемогли!");
                    playerScore++;
                    break;
                case -1:
                    System.out.println("Ви програли!");
                    computerScore++;
                    break;
            }

        }
        scanner.close();
        printGameStats();
    }

    private static void printGameStats() {
        double percentageWon = (playerScore + ((double) drawGame) / 2) / gamesPlayed;

        // Виведення лінії
        System.out.print("+");
        printDashes(74);
        System.out.println("+");

// Виведення заголовків таблиці
        System.out.printf("|  %8s  |  %7s  |  %6s  |  %13s  |  %16s  |\n",
                "ПЕРЕМОГА", "ПОРАЗКА", "НІЧИЯ", "ВСЬОГО ІГОР", "ВІДСОТОК ПЕРЕМОГ");

        // Виведення лінії
        System.out.print("|");
        printDashes(12);
        System.out.print("+");
        printDashes(11);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(17);
        System.out.print("+");
        printDashes(20);
        System.out.println("|");

// Виведення значень
        System.out.printf("|  %8d  |  %7d  |  %6d  |  %13d  |  %15.2f%%  |\n",
                playerScore, computerScore, drawGame, totalGames, percentageWon * 100);
        // Виведення лінії
        System.out.print("+");
        printDashes(74);
        System.out.println("+");
    }

    private static void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
}


