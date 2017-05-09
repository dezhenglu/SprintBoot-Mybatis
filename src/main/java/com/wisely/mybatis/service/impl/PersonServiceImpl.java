package com.wisely.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import com.wisely.mybatis.dao.PersonMapper;
import com.wisely.mybatis.pojo.Person;
import com.wisely.mybatis.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonMapper personMapper; 
	
	@Override
	public Person selectById(Long id) {
		return personMapper.selectById(id);
	}

	@Override
//	@Transactional
	public void deleteById(Long id) {
		personMapper.deleteById(id);
	}

	@Override
	public List<Person> selectAll() {
		return personMapper.selectAll();
	}

}
