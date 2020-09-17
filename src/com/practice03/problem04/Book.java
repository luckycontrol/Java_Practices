package com.practice03.problem04;

public class Book {
    
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;

    public Book(int bookNo, String title, String author) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.stateCode = 1;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void rent(int bookNo) {
        if(this.stateCode == 1) {
            if(this.bookNo == bookNo) {
                System.out.println(title + "이(가) 대여되었습니다.");
                this.stateCode = 0;
            }
        } else {
            System.out.println("이미 대여중인 책입니다.");
        }
    }

    public void print() {
        System.out.print(bookNo + " 책 제목: " + title + ", 작가: " + author + ", 대여유무: ");
        if(stateCode == 0) {
            System.out.println("대여중");
        } else {
            System.out.println("재고있음");
        }
    }
}
