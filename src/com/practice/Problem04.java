package com.practice;

public class Problem04 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++) {
            for(int j=i; j<i+10; j++) {
                System.out.printf("%d \t", j);
            }
            System.out.println();
        }
    }
}
