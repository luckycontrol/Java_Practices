package com.practice2;

import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userInput;
        do {
            game();

            System.out.print("게임을 종료하시겠습니까? (y / n) \t >> ");
            while(true) {
                userInput = in.next();
                if(userInput.equals("y") || userInput.equals("n")) break;
            }

        } while(userInput.equals("n"));

        System.out.println("==============================");
        System.out.println("\t [숫자맞추기게임 종료] \t");
        System.out.println("==============================");
    }

    public static void game() {
        Scanner in = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("\t [숫자맞추기게임 시작] \t");
        System.out.println("==============================");

        int answer = (int)(Math.random() * 45) + 1;
        int userInput;
        while(true) {
            System.out.print(">> ");
            userInput = in.nextInt();

            if (userInput == answer) break;
            else if (userInput > answer) {
                System.out.println("더 낮게");
            } else {
                System.out.println("더 높게");
            }
        }

        System.out.println("맞았습니다.");
    }
}
