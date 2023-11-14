package com.hxy.springbootconfiguration.controller;

import com.hxy.springbootconfiguration.bean.Book;
import com.hxy.springbootconfiguration.config.BookConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {
    @Autowired
    private BookConfig bookConfig;
    @RequestMapping("/json")
    public Book showBook(){
        Book book=new Book();
        book.setName(bookConfig.getName());
        book.setPrice(bookConfig.getPrice());
        return book;
    }
}
