package com.superzzc93.service;

import com.superzzc93.domain.Book;

import java.util.List;

/**
 * @ClassName BookService
 * @Description
 * @Author superzzc93
 * @Date 2018/7/26 20:18
 * @Version 1.0
 */


public interface BookService {

    List<Book> getAllBooks();

    int addBook(Book book);

}
