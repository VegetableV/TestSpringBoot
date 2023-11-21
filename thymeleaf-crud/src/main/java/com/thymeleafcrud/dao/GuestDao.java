package com.thymeleafcrud.dao;

import com.thymeleafcrud.bean.Guest;
import com.thymeleafcrud.service.GuestService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {
    public static final List<Guest> guests=new ArrayList<>();
    static {
        guests.add(new Guest("黄昏","间谍/父亲"));
        guests.add(new Guest("约尔","杀手/母亲"));
        guests.add(new Guest("阿尼亚","小学生/孩子"));
        guests.add(new Guest("达米安","小学生/次子"));
        guests.add(new Guest("尤里","秘密警察/舅舅"));
    }

    public List<Guest> list(){
        return guests;
    }

    public void add(Guest guest){
        guests.add(guest);
    }
}
