package com.practice02;

import java.util.ArrayList;

public class Problem04 {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        for(int i=0; i<6; i++) {
            lotto.getLottoNumber();
        }

        System.out.println(lotto);
    }
}

class Lotto {

   private ArrayList<Integer> lottoNumbers = new ArrayList<>();

   public void getLottoNumber() {
       int num = -1;
       boolean duplicate = false;

       do {
           num = (int)(Math.random() * 45) + 1;

           for(int n : lottoNumbers) {
               if(n == num) { duplicate = true; break; }
           }
       } while(duplicate);

        lottoNumbers.add(num);
   }

    @Override
    public String toString() {
        return "로또 번호 >> " + lottoNumbers;
    }
}
