package me.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.main.beans.User;
import me.main.dao.DAO;

@Service
public class ServiceImpl implements Servicee {

	@Autowired
	DAO dao;

	@Override
	public boolean addUser(User user) {
		boolean status = false;

		try {
			dao.save(user);
			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public boolean deleteUser(int id) {
		boolean status = false;

		try {
			dao.deleteById(id);
			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}

}
