package com.joao.libraryfx.products;

import com.joao.libraryfx.Author;

public class Ebook extends Book implements Promotional{

    private String waterMark;

    public Ebook(Author author) {super(author);}

    @Override
    public boolean applyDiscount(double percent) {
        if (percent > 0.15) {
            return false;
        }
        double discount = getPrice() * percent;
        setPrice(getPrice() - discount);
        return true;
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public String toString() {
        return "I'm a Ebook";
    }
}
