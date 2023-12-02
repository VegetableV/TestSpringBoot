package com.mybatis.service.impl;




import com.mybatis.entity.Guset;

import com.mybatis.service.GuestService;
import com.mybatis.tk.myabtis.TKGusetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private TKGusetMapper tkGusetMapper;
    @Override
    public List<Guset> list() {
        List<Guset> all = tkGusetMapper.selectAll();
        return all;
    }



}
