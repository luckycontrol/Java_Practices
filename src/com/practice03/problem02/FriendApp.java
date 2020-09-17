package com.practice03.problem02;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        String friendInfo;


        // 친구정보 입력받기
        for(int i=0; i<3; i++) {
            friendInfo = sc.nextLine();
            String[] friendInfoList = friendInfo.split(" ");

            Friend friend = new Friend();
            friend.setName(friendInfoList[0]);
            friend.setHp(friendInfoList[1]);
            friend.setSchool(friendInfoList[2]);

            friendArray[i] = friend;
        }
        
        // 친구정보 출력
        for(Friend f : friendArray) {
            System.out.println(f);
        }

        sc.close();
    }

}
