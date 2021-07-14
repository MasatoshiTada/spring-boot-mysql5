package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HogeMapper {

    @Select("SELECT id, name FROM hoge")
    List<Hoge> selectAll();
}
