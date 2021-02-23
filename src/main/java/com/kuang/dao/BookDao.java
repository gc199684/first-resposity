package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {
    //增加一本书
    int add(Books books);
    //删除一本书
    int deleteBookById(@Param("bookId") int id);
    //更新一本书
    int updateBook(Books books);
    //通过id查询一本书籍
    Books selectById(@Param("bookId") int id);
    List<Books> selectAll();
    //查询全部书籍
    Books queryBookByName(@Param("bookName")String bookName);
}

