package com.joao.libraryfx;

import com.joao.libraryfx.products.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private double total;
    private final List<Product> products;

    public ShoppingCart() {this.products = new ArrayList<Product>();}

    public void add(Product product) {this.products.add(product);}

    public void remove(int position) {this.products.remove(position);}

    public double getTotal() {return total;}

    public List<Product> getProducts() {return products;}
}
