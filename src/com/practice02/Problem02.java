package com.practice02;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] numArr = new Integer[5];
        int sum = 0;

        for(int i=0; i<5; i++) {
            System.out.print("숫자를 입력하세요 >> ");
            numArr[i] = in.nextInt();
        }

        for(int i=0; i<numArr.length; i++) {
            sum += numArr[i];
        }

        System.out.println("평균은 " + sum / numArr.length + " 입니다.");

    }
}