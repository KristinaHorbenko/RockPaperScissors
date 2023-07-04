package org.example;

public class Computer {
    public static Move getComputerMove() {
        int randomChoice = (int) (Math.random() * 3) + 1;

        switch (randomChoice) {
            case 1:
                System.out.println("Комп'ютер обрав: Камінь");
                ChoiceSlector.printRock();
                return Move.ROCK;
            case 2:
                System.out.println("Комп'ютер обрав: Папір");
                ChoiceSlector.printPaper();
                return Move.PAPER;
            case 3:
                System.out.println("Комп'ютер обрав: Ножиці");
                ChoiceSlector.printScissors();
                return Move.SCISSORS;
            default:
                return null;
            }
        }
     }


