package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增加一本书
    int add(Books books);
    //删除一本书
    int deleteBookById( int id);
    //更新一本书
    int updateBook(Books books);
    //通过id查询一本书籍
    Books selectById( int id);
    //查询全部书籍
    List<Books> selectAll();
    //通过书名查询全部名字
    Books queryBookByName(String bookName);

}
