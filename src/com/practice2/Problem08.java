package com.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem08 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int userInput;
        int totalPrice = 0;

       while(true) {
           System.out.println("--------------------------------------");
           System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
           System.out.println("--------------------------------------");

           while(true) {
               System.out.print("선택 > ");
               userInput = in.nextInt();

               if(userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4) break;
               System.out.println("다시 입력해주세요");
           }

           if(userInput == 1) {
               totalPrice = add(totalPrice);
           }
           else if(userInput == 2) {
               totalPrice = sub(totalPrice);
           }
           else if(userInput == 3) {
               System.out.println("잔고액 > " + totalPrice);
           }
           else {
               break;
           }
       }

        System.out.println("프로그램 종료");
    }

    public static int add(int totalPrice) {
        System.out.print("예금액 > ");
        int add_money = in.nextInt();

        return totalPrice + add_money;
    }

    public static int sub(int totalPrice) {
        System.out.print("출금액 > ");
        int sub_money = in.nextInt();

        return totalPrice - sub_money;
    }
}
