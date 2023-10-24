package com.study.DesignPattern.iterator.test;

import com.study.DesignPattern.iterator.Book;

import java.util.Iterator;

/**
 * 연습 문제 1
 * 예제 프로그램의 BookShelf 클래스에서는 처음 지정한 책장 크기를 넘어서 책을 넣을 수 없습니다.
 * 무리하게 넣으려고 하면, ArrayIndexOutOfBoundsException 예외가 발생합니다.
 * 그러므로 배열이 아니라 ArrayList를 사용하여, 책장 크기를 넘어도 책을 추가할 수 있게 만들어보세요.
 */
public class Main_2 {
    public static void main(String[] args) {

        BookShelf_2 bookShelf = new BookShelf_2();
        bookShelf.appendBook(new Book("Book1"));
        bookShelf.appendBook(new Book("Book2"));
        bookShelf.appendBook(new Book("Book3"));
        bookShelf.appendBook(new Book("Book4"));
        bookShelf.appendBook(new Book("Book5"));
        bookShelf.appendBook(new Book("Book6"));
        bookShelf.appendBook(new Book("Book7"));

        //BookShelf가 Array[] 에서 ArrayList로 타입이 변경되어도 아래 while 루프는 변경없이 동작한다.
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();
    }

}
