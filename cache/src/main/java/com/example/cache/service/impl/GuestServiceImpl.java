package com.example.cache.service.impl;




import com.example.cache.entity.Guest;
import com.example.cache.mapper.GusetMapper;
import com.example.cache.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GusetMapper gusetMapper;

//    @Cacheable("guest")
    @Override
    public List<Guest> list() {
        List<Guest> all = gusetMapper.selectAll();
        return all;
    }

    @Cacheable(cacheNames = "guest",key = "#id",unless = "#id>2")
    @Override
    public Guest selectById(Integer id) {
        System.out.println("查询到第"+id+"位嘉宾");
        return gusetMapper.selectById(id);

    }

    @CachePut(cacheNames = "guest",key = "#guest.id")
    @Override
    public Guest save(Guest guest) {
        int save = gusetMapper.save(guest);
        if (save>0){
            return guest;
        }
        return null;
    }

    @CacheEvict(cacheNames = "guest",allEntries = true )
    @Override
    public void delete(Integer id) {
        System.out.println(id);
         gusetMapper.delete(id);
    }


}
