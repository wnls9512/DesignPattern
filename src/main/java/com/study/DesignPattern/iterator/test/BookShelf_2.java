package com.study.DesignPattern.iterator.test;

import com.study.DesignPattern.iterator.Book;
import com.study.DesignPattern.iterator.BookShelfIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf_2 implements Iterable<Book>{

    private ArrayList<Book> books;

    public BookShelf_2() {
        this.books = new ArrayList<Book>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator_2(this);
    }
}
