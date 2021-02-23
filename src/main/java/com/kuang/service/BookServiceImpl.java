package com.kuang.service;

import com.kuang.dao.BookDao;
import com.kuang.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    //service调dao
    @Autowired
    private BookDao bookDao;

   // public void setBookDao(BookDao bookDao) {
    //    this.bookDao = bookDao;
    //}

    @Override
    public int add(Books books) {
        return bookDao.add(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookDao.updateBook(books);
    }

    @Override
    public Books selectById(int id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Books> selectAll() {
        return bookDao.selectAll();
    }

    @Override
    public Books queryBookByName(String bookName) {
        return bookDao.queryBookByName(bookName);
    }
}
