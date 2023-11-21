package com.hxy.springbootconfiguration.controller;

import com.hxy.springbootconfiguration.bean.Book;
import com.hxy.springbootconfiguration.bean.Egg;
import com.hxy.springbootconfiguration.bean.Vegetable;
import com.hxy.springbootconfiguration.config.BookConfig;
import com.hxy.springbootconfiguration.config.EggConfig;
import com.hxy.springbootconfiguration.config.VegetableConfig;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JsonController {
    @Autowired
    private BookConfig bookConfig;
    @RequestMapping("/json")
    public Book showBook(){
        Book book=new Book();
        book.setName(bookConfig.getName());
        book.setPrice(bookConfig.getPrice());
        book.setType(bookConfig.getType());
        return book;
    }
    @Autowired
    private VegetableConfig vegetableConfig;
    @RequestMapping("/vegetable")
    public Vegetable showVegetable(){
        Vegetable vegetable=new Vegetable();
        vegetable.setEggplant(vegetableConfig.getEggplant());
        vegetable.setGreen(vegetableConfig.getGreen());
        vegetable.setPotato(vegetableConfig.getPotato());
        return vegetable;
    }

    @Autowired
    private EggConfig eggConfig;

    @RequestMapping("/egg")
    public Egg showEgg(){
        Egg egg=new Egg();
        egg.setEgg(eggConfig.getEgg());
        egg.setRice(eggConfig.getRice());
        return egg;
    }

    @Value("${info.username}")
    public String username;
    @Value("${info.password}")
    public String password;

    @RequestMapping("/jasypt")
    public String showJasypt(){
        BasicTextEncryptor encryptor=new BasicTextEncryptor();
        encryptor.setPassword("1234");
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(encryptor.decrypt(username));
        stringBuffer.append("\t");
        stringBuffer.append(encryptor.decrypt(password));
        return stringBuffer.toString();
    }

//    @Value("")
//    private List<Book> books;
//    @RequestMapping("arrayObject")
//    public List<Book> showArray(){
//        List<Book> books=new ArrayList<>();
//        return books;
//    }
}
