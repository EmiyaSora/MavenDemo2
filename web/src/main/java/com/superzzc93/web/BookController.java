package com.superzzc93.web;

import com.superzzc93.domain.Book;
import com.superzzc93.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @ClassName BookController
 * @Description
 * @Author superzzc93
 * @Date 2018/7/26 20:29
 * @Version 1.0
 */

@Controller
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("all.do")
    public ModelAndView getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("result");
        return mv;
    }

}
