package com.mybatis.mapper;

import com.mybatis.entity.Guset;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GusetMapper {

    List<Guset> selectAll();
}
