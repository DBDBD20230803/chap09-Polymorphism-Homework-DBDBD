package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem;
    private Book[] bList = new Book[5];


    public void insertMember(Member mem) {

    }

    public Member myInfo() {
        return null;
    }

    public Book[] selectAll() {
        return null;
    }

    public Book[] searchBook(String keyword) {

        Book[] searchList = new Book[5];
        int count = 0;

        for(int i=0; i<bList.length; i++) {
            if(bList[i].getTitle().contains(keyword)) {
                searchList[count] = bList[i];
                count++;
            }


        }

        return searchList;
    }

    public int rentBook(int index) {
        return 0;
    }
}
