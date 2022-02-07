package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11. Игра началась...");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            while (matches < 1 || matches > 3) {
                System.out.println("Выберите, пожалуйста, от 1 до 3 спичек");
                matches = Integer.valueOf(input.nextLine());
            }
            count = count - matches;

            if (count <= 0) {
                    System.out.println("Игра закончена, победил " + player);
                    break;
            }
        }
    }
}
