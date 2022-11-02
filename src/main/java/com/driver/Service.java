package com.driver;

import org.springframework.beans.factory.annotation.Autowired;

import com.driver.repository.Repo;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repo rep;
	
	public Book getBookbyId(int id) {
		// TODO Auto-generated method stub
		Book b=rep.getBookbyId(id);
		return b;
	}

}
