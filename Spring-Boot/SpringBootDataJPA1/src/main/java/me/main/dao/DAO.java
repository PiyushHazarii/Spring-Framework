package me.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import me.main.beans.User;

public interface DAO extends JpaRepository<User, Integer>{

}
