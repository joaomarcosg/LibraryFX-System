package com.joao.libraryfx.products;

public interface Product extends Comparable<Product> {

    double getPrice();
    String getName();
    String getDescription();
    String getIsbn();

}
