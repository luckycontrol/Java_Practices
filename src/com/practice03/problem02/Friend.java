package com.practice03.problem02;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Friend {

    private String name;
    private String hp;
    private String school;
    
    //필요한 메소드 작성
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "이름: " + name + " 핸드폰: " + hp + " 학교:" + school;
    }
}
