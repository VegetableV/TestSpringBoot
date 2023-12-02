package com.springbootmybatisplus.mapper;


//import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springbootmybatisplus.domain.Guset;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface GuestMapper extends BaseMapper<Guset> {

}
