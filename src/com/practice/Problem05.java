package com.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("숫자를 입력하세요 [음수 입력하면 종료]");

        int input = in.nextInt();
        do {
            numList.add(input);

            input = in.nextInt();
        }while(input > 0);


        int max = numList.get(0);
        for(int i=1; i<numList.size(); i++) {
            if(max < numList.get(i)) {
                max = numList.get(i);
            }
        }

        System.out.println("최대값은 " + max +"입니다.");
    }
}
