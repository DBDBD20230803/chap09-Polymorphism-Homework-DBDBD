package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;

import java.util.Scanner;

public class LibraryMenu {

    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

    }

    public void selectAll() {

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

    }
}
