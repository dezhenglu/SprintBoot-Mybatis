package com.wisely.mybatis.service;

import java.util.List;

import com.wisely.mybatis.pojo.Person;

public interface PersonService {  
    Person selectById(Long id);  
    List<Person> selectAll();  
    void deleteById(Long id);  
}  
  
 
