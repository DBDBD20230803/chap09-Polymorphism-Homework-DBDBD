package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = Integer.parseInt(sc.next());
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        Member member = new Member(name, age, gender);
        lm.insertMember(member);

        while(true) {
            System.out.println("=====메뉴=====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1 :
                    System.out.println(lm.myInfo()); break;
                case 2 : selectAll(); break;
                case 3 : searchBook(); break;
                case 4 : rentBook(); break;
                case 0 :
                    System.out.println("프로그램을 종료합니다."); return;
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
        }

        Book[] books = lm.selectAll();

        for (int i=0; i<5; i++) {
            System.out.println(books[i]);
        }

    }

    public void selectAll() {
        /* 내가 해야 할 부분 */
    }

    public void searchBook() {

    }

    public void rentBook() {

    }
}
