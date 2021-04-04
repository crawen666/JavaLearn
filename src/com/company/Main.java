package com.company;

import java.util.Scanner;

public class Main {

    String player1;
    String Player2;

    public static void main(String[] args) {
	// write your code here
        Player p1 = new Player();
        Player p2 = new Player();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя первого бойца");
        String player1 = scan.nextLine();
        System.out.println("Введите имя второго бойца");
        String player2 = scan.nextLine();
        p1.setName(player1);
        p2.setName(player2);

        while (p1.isAlive && p2.isAlive) {
                int d1 = (int) (Math.random() * p1.power);
                if (p1.isAlive) {
                    System.out.println(player1 + " " + "наносит" + " " + d1 + " " + "повреждений");
                    p2.takeDamage(d1);
                    System.out.println("У" + " " + player2 + " " + "осталось" + " " + p2.getHealth() + " " + "жизней");
                }
                int d2 = (int) (Math.random() * p2.power);
                if (p2.isAlive) {
                    System.out.println(player2 + " " + "наносит" + " " + d2 + " " + "повреждений");
                    p1.takeDamage(d2);
                    System.out.println("У" + " " + player1 + " " + "осталось" + " " + p1.getHealth() + " " + "жизней");
                }

                if (p2.getHealth() <= 0) {
                    p2.isAlive = false;
                    System.out.println("Победил" + " " + player1);
                    break;
                }
                else if (p1.getHealth() <= 0) {
                    System.out.println("Победил" + " " + player2);
                    p1.isAlive = false;
                    break;
                }



        }

    }
}
