package org.example;

public class Computer {
    public static Move getComputerMove() {
        int randomChoice = (int) (Math.random() * 3) + 1;

        switch (randomChoice) {
            case 1:
                System.out.println("Комп'ютер обрав: Камінь");
                System.out.println("""
                _______
            ---'   ____)
                  (_____)
                  (_____)
                  (____)
            ---.__(___)
            """);
                return Move.ROCK;
            case 2:
                System.out.println("Комп'ютер обрав: Папір");
                System.out.println("""
                _______
            ---'    ____)____
                       ______)
                      _______)
                     _______)
            ---.__________)
            """);
                return Move.PAPER;
            case 3:
                System.out.println("Комп'ютер обрав: Ножиці");
                System.out.println("""
                _______
            ---'   ____)____
                      ______)
                   __________)
                  (____)
            ---.__(___)
            """);
                return Move.SCISSORS;
            default:
                return null;
            }
        }
     }


