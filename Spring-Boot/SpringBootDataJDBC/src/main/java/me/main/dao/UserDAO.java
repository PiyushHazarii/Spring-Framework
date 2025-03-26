package me.main.dao;

import org.springframework.data.repository.CrudRepository;

import me.main.beans.User;

public interface UserDAO extends CrudRepository<User, String>{
	 
}
