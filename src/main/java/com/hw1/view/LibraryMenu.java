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

    }

    public void selectAll() {

        Book[] books = lm.selectAll();

        for (int i=0; i<5; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchBook() {
        System.out.printf("검색할 책의 제목을 입력하세요: ");
        String title = sc.nextLine();

        Book[] searchList = lm.searchBook(title);

        for(Book book : searchList){
            if(book != null){
                System.out.println(book);
            }
        }
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
