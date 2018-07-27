package com.superzzc93.dao;

import com.superzzc93.domain.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName BookDao
 * @Description
 * @Author superzzc93
 * @Date 2018/7/26 20:10
 * @Version 1.0
 */

public interface BookDao {

    @Select("select * from books")
    List<Book> getAllBooks();

    @Insert("insert into books values(#{id},#{name},#{price},#{pnum},#{category})")
    int addBook(Book book);
}
