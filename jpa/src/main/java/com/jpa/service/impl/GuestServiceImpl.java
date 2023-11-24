package com.jpa.service.impl;



import com.jpa.entity.Guset;
import com.jpa.repository.GuestRepository;
import com.jpa.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestRepository repository;;
    @Override
    public List<Guset> list() {
        List<Guset> all = repository.findAll();
        return all;
    }



}
