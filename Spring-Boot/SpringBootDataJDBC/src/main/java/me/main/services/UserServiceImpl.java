package me.main.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.main.beans.User;
import me.main.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Transactional
	@Override
	public boolean addUserr(User user) {
		boolean status = false;
		try {
			// yaha par hum is new ko true iss liye kar rahe hai kyuki jab bhi ye true
			// reutrn karega
			// to spring ko pata chal jayega ki wo new user hai to wo new mein add karwa
			// dega user ko
			// but agar ye false provide kr diye to spring smajh jayega ki wo new user nhi
			// hai to
			// wo usko update karwayega naaki new mein add karega jaise ki niche dekho
			// update user mein
			// false provide kiye hai.
			User.is_new = true;
			User user1 = userDAO.save(user);
			if (user1.getEmail().equals(user1.getId())) {
				status = true;
			} else {
				status = false;
			}
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}

	@Transactional
	@Override
	public boolean updateUser(User user) {
		boolean status = false;
		try {
			User.is_new = false;
			User user1 = userDAO.save(user);
			if (user1.getEmail().equals(user1.getId())) {
				status = true;
			} else {
				status = false;
			}
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}

	@Transactional
	@Override
	public boolean deleteUser(String email) {
		boolean status = false;
		try {
			userDAO.deleteById(email);
			status = true;
		} catch (Exception e) {
			status = false;
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public User searchUser(String email) {
		User user = null;
		try {
			// optional is an interface in java . util package ke andar
			// jisme ho skta hai data aa bhi skta hai aur ho skta hai data na bhi aaye
			Optional<User> optional = userDAO.findById(email);
			if (optional.isPresent()) {
				user = optional.get();
			}
		} catch (Exception e) {
			user = null;
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		Iterable<User> userIterable = userDAO.findAll();
		
		List<User> userList = new ArrayList<User>();
		
		Iterator<User> iterator = userIterable.iterator();
		
		while(iterator.hasNext()) {
			User user = iterator.next();
			userList.add(user);
		}
		return userList;
	}

}
