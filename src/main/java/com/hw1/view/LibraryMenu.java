package com.hw1.view;

import com.hw1.controller.LibraryManager;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

    }

    public void selectAll() {

    }

    public void searchBook() {

    }

    public void rentBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("대여할 도서 번호를 입력해주세요 : ");
        int index = sc.nextInt();

        int result = lm.rentBook(index);

        if(result == 0) {
            System.out.println("성공적으로 대여되었습니다.");
        } else if(result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if(result == 2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
        }
    }
}
