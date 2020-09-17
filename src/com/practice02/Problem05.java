package com.practice02;

public class Problem05 {
    public static void main(String[] args) {
        int scoreboard[][] = {
                { 80, 75, 90, 95, 78 },
                { 92, 88, 89, 92, 70 },
                { 78, 80, 85, 86, 63 },
                { 83, 84, 89, 87, 75 },
                { 89, 83, 93, 94, 78 }
        };

        int sum = 0;
        int count = 0;
        int result = 0;

        for(int i=0; i<scoreboard.length; i++) {
            for(int num : scoreboard[i]) {
                if(num >= 85) {
                    sum += num;
                    count ++;
                }
            }
        }

        result = sum / count;

        System.out.println("85점 이상의 합 >> " + sum);
        System.out.println("85점 이상의 평균 >> " + result);
    }
}