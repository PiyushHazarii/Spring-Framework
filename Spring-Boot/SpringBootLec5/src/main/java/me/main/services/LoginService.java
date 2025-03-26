package me.main.services;

import java.util.List;

import me.main.beans.Student;

public interface LoginService {
	public List<Student> loginService(String email,String pass);
}
