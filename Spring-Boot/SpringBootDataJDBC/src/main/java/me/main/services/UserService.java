package me.main.services;

import java.util.List;

import me.main.beans.User;

public interface UserService {
	public boolean addUserr(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(String email);
	public User searchUser(String email);
	public List<User> getAllUsers();
}
