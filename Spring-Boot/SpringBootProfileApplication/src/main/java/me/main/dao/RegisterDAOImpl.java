package me.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import me.main.beans.Student;

@Repository
public class RegisterDAOImpl implements RegisterDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean reigsterDao(Student student) {
		boolean status = false;
		try {
			String sql_Query = "insert into stdd values(?,?,?,?,?)";
			int count = jdbcTemplate.update(sql_Query, new Object[] { student.getName(), student.getEmail(),
					student.getPassword(), student.getGender(), student.getCity() });
			if (count > 0) {
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
}
