package com.thymeleafcrud.service.impl;

import com.thymeleafcrud.bean.Guest;
import com.thymeleafcrud.dao.GuestDao;
import com.thymeleafcrud.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao guestDao;
    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

}
