package com.mybatis.service;




import com.mybatis.entity.Guset;

import java.util.List;

public interface GuestService {
    List<Guset> list();
    int save(Guset guset);

}
