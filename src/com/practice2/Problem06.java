package com.practice2;

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int num = in.nextInt();

        int result = 0;
        for(int i=num; i>0; i-=2) {
            result += i;
        }

        System.out.println("결과값: " + result);
    }
}
