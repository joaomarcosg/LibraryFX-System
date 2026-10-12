package com.joao.libraryfx.products;

import com.joao.libraryfx.Publisher;

public class Magazine implements Product, Promotional{

    private String name;
    private String description;
    private double price;
    private Publisher publisher;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public boolean applyDiscount(double percent) {
        if (percent > 0.1) {
            return false;
        }
        double discount = getPrice() * percent;
        setPrice(getPrice() - discount);
        return true;
    }

    @Override
    public int compareTo(Product other) {

        if (this.getPrice() < other.getPrice()) {
            return -1;
        }

        if  (this.getPrice() > other.getPrice()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String getIsbn() {return null;}
}
