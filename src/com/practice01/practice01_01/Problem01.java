package com.practice01.practice01_01;

public class Problem01 {
    public static void main(String[] args) {
        /* 1 ~ 100까지의 수 중 5의배수면서 7의 배수 출력 */

        int minial_mul = 5 * 7;

        int result = minial_mul;

        while(result < 100) {
            System.out.println(result);
            result += minial_mul;

        }
    }
}
