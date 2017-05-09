package com.wisely.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wisely.mybatis.pojo.Person;  

  
@Mapper  
public interface PersonMapper {  
    Person selectById(Long id);  
    List<Person> selectAll();  
    int deleteById(Long id);  
}  
