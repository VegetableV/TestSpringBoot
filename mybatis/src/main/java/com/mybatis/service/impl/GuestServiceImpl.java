package com.mybatis.service.impl;




import com.mybatis.entity.Guset;

import com.mybatis.mapper.GusetMapper;
import com.mybatis.mapper2.GuestMapper2;
import com.mybatis.service.GuestService;
import com.mybatis.tk.myabtis.TKGusetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
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

    @Override

    public int save(Guset guset) {
        int i= tkGusetMapper.insert(guset);

        return i;

    }


}
