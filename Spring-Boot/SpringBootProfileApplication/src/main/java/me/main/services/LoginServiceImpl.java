package me.main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.main.beans.Student;
import me.main.dao.LoginDAO;



@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;

	@Override
	public List<Student> loginService(String email, String pass) {
//		this is not the good way to do this it will leak our security
//		LoginDAOImpl loginDAOImpl = new LoginDAOImpl();
//		List<Student> list = loginDAOImpl.loginDao(email, pass);
//		return list;

		
		List<Student> list = loginDAO.loginDao(email, pass);
		return list;
	}

}
