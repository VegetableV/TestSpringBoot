package com.springbootmybatisplus.service.impl;



import com.springbootmybatisplus.domain.Guset;
import com.springbootmybatisplus.mapper.GuestMapper;
import com.springbootmybatisplus.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestMapper guestMapper;
    @Override
    public List<Guset> list() {
        List<Guset> all = guestMapper.selectList(null);
        return all;
    }



}
