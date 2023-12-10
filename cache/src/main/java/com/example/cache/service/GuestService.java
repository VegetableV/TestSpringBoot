package com.example.cache.service;





import com.example.cache.entity.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> list();
    Guest selectById(Integer id);

    Guest save(Guest guest);

    void delete(Integer id);
}
