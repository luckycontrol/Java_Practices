package com.practice02;

import java.util.ArrayList;

public class Problem01 {
    public static void main(String[] args) {
        int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
        ArrayList<Integer> resultArr = new ArrayList<>();

        int result = 0;

        for(Integer num : data) {
            if(num % 3 == 0) {
                resultArr.add(num);
                result += num;
            }
        }

        System.out.println("주어진 배열에서 3의 배수의 갯수 : " + resultArr.size());
        System.out.println("주어진 배열에서 3의 배수의 합 : " + result);
    }
}
