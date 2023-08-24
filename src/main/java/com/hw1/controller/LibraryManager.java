package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem;

    private Book[] bList = new Book[5];



    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
    }


    public void insertMember(Member mem) {

    }

    public Member myInfo() {
        return this.mem;
    }

    public Book[] selectAll() {

        System.out.println(bList[1]);

        return bList;
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
        int result = 0;

        if(bList[index] instanceof AniBook) {
            AniBook aniBook = (AniBook) bList[index];

            if(aniBook.getAccessAge() > mem.getAge()) {
                result = 1;
            }
        } else if(bList[index] instanceof CookBook) {
            CookBook cookBook = (CookBook) bList[index];
            if(cookBook.isCoupon() == true) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                result = 2;
            }
        }
        return result;
    }
}
