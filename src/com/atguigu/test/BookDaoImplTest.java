package com.atguigu.test;

import com.atguigu.dao.impl.BookDaoImpl;
import com.atguigu.pojo.Book;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookDaoImplTest {

    @Test
    public void addBook() {
    }

    @Test
    public void deleteBookById() {
    }

    @Test
    public void testAddBook() {
    }

    @Test
    public void testDeleteBookById() {
    }

    @Test
    public void updateBook() {
    }

    @Test
    public void queryBookByName() {
    }

    @Test
    public void queryBookById() {
        BookDaoImpl i = new BookDaoImpl();
        Book book = i.queryBookById(1);
        System.out.println(book.toString());
    }

    @Test
    public void queryBooks() {
    }
}