package com.atguigu.test;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.impl.BookDaoImpl;
import com.atguigu.pojo.Book;
import com.atguigu.pojo.Page;
import com.atguigu.service.BookService;
import com.atguigu.service.impl.BookServiceImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceTest {

    private BookService bookService = new BookServiceImpl();

    @Test
    public void queryBookByName() {
        System.out.println(bookService.queryBookByName("西游记"));
    }

    @Test
    public void queryBooks() {
        for (Book queryBook : bookService.queryBooks()){
            System.out.println(queryBook);
        }
    }

    @Test
    public void queryBookById() {
        System.out.println(bookService.queryBookById(1));

    }

    @Test
    public void deleteBookById(){
        bookService.deleteBookById(20);
    }

    @Test
    public void updateBook() {
        bookService.updateBook(new Book(13,"西游记",13,"adasd",156,1313,"static/img/default.jpg"));
    }


    @Test
    public void addBook() {
    }

    @Test
    public void testDeleteBookById() {
    }

    @Test
    public void testUpdateBook() {
    }

    @Test
    public void testQueryBookByName() {
    }

    @Test
    public void testQueryBookById() {
    }

    @Test
    public void testQueryBooks() {
    }

    @Test
    public void page() {
        System.out.println(bookService.page(1, Page.PAGE_SIZE));
    }
}