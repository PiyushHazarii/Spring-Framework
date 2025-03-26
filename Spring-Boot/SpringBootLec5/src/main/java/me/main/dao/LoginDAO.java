package me.main.dao;

import java.util.List;

import me.main.beans.Student;

public interface LoginDAO {
	public List<Student> loginDao(String email, String password);
}
