package com.mybatis.mapper2;


import com.mybatis.entity.Guset;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper2{
    @Select("select * from guset")
    List<Guset> selectAll();
}
