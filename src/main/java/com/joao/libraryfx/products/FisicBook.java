package com.joao.libraryfx.products;

import com.joao.libraryfx.Author;

public class FisicBook extends Book implements Promotional{

    public FisicBook(Author author) {super(author);}

    public double getPrintFee() {return this.getPrice() * 0.05;}

    @Override
    public boolean applyDiscount(double percent) {
        if (percent > 0.3) {
            return false;
        }
        double discount = getPrice() * percent;
        setPrice(getPrice() - discount);
        return true;
    }
}
