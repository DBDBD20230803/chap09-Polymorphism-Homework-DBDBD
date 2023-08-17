package com.hw1.model.dto;

public class CookBook  extends Book {

    private boolean coupon;

    public CookBook() {
    }

    public CookBook(boolean coupon) {
        this.coupon = coupon;
    }

    public CookBook(String title, String author, String publisher, boolean coupon) {
        super(title, author, publisher);
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "CookBook{" +
                "coupon=" + coupon +
                '}';
    }
}
