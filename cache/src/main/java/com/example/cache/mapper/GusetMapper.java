package com.example.cache.mapper;

import com.example.cache.entity.Guest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GusetMapper {
    @Select("select * from guest")
    List<Guest> selectAll();
    @Select("select * from guest where id=#{id}")
    Guest selectById(Integer id);

    @Insert("insert into guest (id,name,role) values (#{id},#{name},#{role})")
    int save(Guest guest);
    @Delete("delete from guest where id=#{id}")
    int delete(Integer id);
}
