package me.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.main.beans.Student;
import me.main.dao.RegisterDAO;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	RegisterDAO registerDAO;
	
	@Override
	public boolean registerService(Student student) {
		
		boolean status = registerDAO.reigsterDao(student);
		return status;
	}

}
