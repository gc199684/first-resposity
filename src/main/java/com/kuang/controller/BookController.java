package com.kuang.controller;
import com.kuang.pojo.Books;
import com.kuang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller调用 service层
    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.selectAll();
        model.addAttribute("list",list);
    return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.add(books);
        return "redirect:/book/allBook";//相当于重定向到@RequestMapping("/allBook")请求；
    }

    //跳转到修改页面
    @RequestMapping("toUpdate")
    public String toUpdatePaper(int id,Model model){
       Books books = bookService.selectById(id);
       model.addAttribute("QBooks",books);
        return "upDateBook";
    }
    //修改书籍
    @RequestMapping("/upDateBook")
    public String updateBook(Books books){
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }
    //删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }
    //查询信息
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
    Books books = bookService.queryBookByName(queryBookName);
    List<Books> list = new ArrayList<Books>();
    list.add(books);
    if (books==null){
        list = bookService.selectAll();
        model.addAttribute("error","未查到");
    }
        model.addAttribute("list",list);
        return "allBook";
    }
}
