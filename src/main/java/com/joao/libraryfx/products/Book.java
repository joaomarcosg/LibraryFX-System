package com.joao.libraryfx.products;

import com.joao.libraryfx.Author;
import com.joao.libraryfx.exception.NullAuthorException;

public abstract class Book implements Product{

    private String name;
    private String description;
    private double price;
    private String isbn;
    private Author author;

    public Book(Author author) {
        if (author == null) {
            throw new NullAuthorException("Books author cannot be null");
        }
        this.author = author;
        this.isbn = "000-00-00000-00-0";
    }

    public void showDetails() {
        IO.println("Mostrando detalhes do livro");
        IO.println("Nome: " + name);
        IO.println("Descrição: " + description);
        IO.println("Valor: " + price);
        IO.println("ISBN: " + isbn);

        if (this.hasAuthor()) {
            author.showDetails();
        }
        IO.println("--");
    }

    boolean hasAuthor() {return this.author != null;}

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

    @Override
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public int compareTo(Product other) {
        if (this.getPrice() < other.getPrice()) {
            return -1;
        }
        if (this.getPrice() > other.getPrice()) {
            return 1;
        }
        return 0;
    }
}
