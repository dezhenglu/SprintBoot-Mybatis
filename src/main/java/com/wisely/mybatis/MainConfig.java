package com.wisely.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisely.mybatis.pojo.Person;
import com.wisely.mybatis.service.PersonService;

@SpringBootApplication  
@RestController
public class MainConfig {

	@Autowired  	
    private PersonService personService;  
	public static void main(String[] args) {
		SpringApplication.run(MainConfig.class, args);  
	}
    @RequestMapping("/get/person/{id}")  
    public Person getPersonById(@PathVariable Long id) {  
        return personService.selectById(id);  
    }  
    @RequestMapping("/get/persons")  
    public List<Person> getPersons() {  
    	return personService.selectAll();
    }  
}
