package com.atguigu.service;

import com.atguigu.pojo.Book;
import com.atguigu.pojo.Page;
import org.junit.Test;

import java.util.List;

public interface BookService {

    public void addBook(Book book);


    public void deleteBookById(Integer id);

    public void updateBook(Book book);


    public Book queryBookByName(String name);


    public Book queryBookById(Integer id);


    public List<Book> queryBooks();

    Page<Book> page(int pageNo, int pageSize);
}