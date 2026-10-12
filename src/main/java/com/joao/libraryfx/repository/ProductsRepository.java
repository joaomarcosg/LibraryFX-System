package com.joao.libraryfx.repository;


import com.joao.libraryfx.Author;
import com.joao.libraryfx.products.Book;
import com.joao.libraryfx.products.FisicBook;
import com.joao.libraryfx.products.Product;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ProductsRepository {
    public ObservableList<Product> list() {
        Author author = new Author();
        author.setName("Rodrigo Turini");
        author.setEmail("rodrigo.turini@caelum.com.br");
        author.setCpf("123.456.789.10");

        Book book = new FisicBook(author);
        book.setName("Java 8 Prático");
        book.setDescription("Novos recursos da linguagem");
        book.setPrice(59.90);
        book.setIsbn("978-85-66250-46-6");

        Book oneMoreBook = new FisicBook(author);

        oneMoreBook.setName("Desbravando a O.O.");
        oneMoreBook.setDescription("Livro de Java e O.O");
        oneMoreBook.setPrice(59.90);
        oneMoreBook.setIsbn("321-54-67890-11-2");

        Author otherAuthor = new Author();
        otherAuthor.setName("Paulo Silveira");
        otherAuthor.setEmail("paulo.silveira@caelum.com.br");
        otherAuthor.setCpf("123.456.789.10");

        Book otherBook = new FisicBook(otherAuthor);
        otherBook.setName("Lógica de Programação");
        otherBook.setDescription("Crie seus primeiros programas");
        otherBook.setPrice(59.90);
        otherBook.setIsbn("978-85-66250-22-0");

        return FXCollections.observableArrayList(book, oneMoreBook, otherBook);
    }
}
