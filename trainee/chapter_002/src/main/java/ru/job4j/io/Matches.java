package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        int player = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("There are " + matches + " on the table. Take 1-3 matches.");
        String p = "Pasha";
        String n = "Nastya";
        String pl = n;
        while (matches > 0) {
            if(pl==n){
                pl = p;
            }else{
                pl = n;
            }

            int select = Integer.valueOf(in.nextLine());
            if (select > 3 || select <= 0) {
                System.out.println("Please take 1, 2, or 3 matches.");
                continue;
            }

            matches -= select;
            if (matches > 0) {
                System.out.println("There are " + matches + " left on the table.");
            } else {
                if (player % 2 == 0) {
                    System.out.println(pl + " have taken the last matches from the table, you win!");
                } else {
                    System.out.println(pl + " have taken the last matches from the table, you win!");
                }
            }
            player++;
        }
    }
}
