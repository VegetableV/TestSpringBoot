package com.thymeleafcrud.service;

import com.thymeleafcrud.bean.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> list();
    void add(Guest guest);
}
