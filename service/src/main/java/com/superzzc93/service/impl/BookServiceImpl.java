package com.superzzc93.service.impl;

import com.superzzc93.dao.BookDao;
import com.superzzc93.domain.Book;
import com.superzzc93.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName BookServiceImpl
 * @Description
 * @Author superzzc93
 * @Date 2018/7/26 20:19
 * @Version 1.0
 */

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }
}
