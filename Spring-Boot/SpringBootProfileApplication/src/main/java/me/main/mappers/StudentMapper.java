package me.main.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import me.main.beans.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//        String name1 = rs.getString("name");
//        String email1 = rs.getString("email");
//        String pass1 = rs.getString("password");
//        String gender1 = rs.getString("gender");
//        String city1 = rs.getString("city");
//
//        Student student = new Student();
//        student.setName(name1);
//        student.setEmail(email1);
//        student.setPassword(pass1);
//        student.setGender(gender1);
//        student.setCity(city1);

        Student student = new Student();
        student.setName(rs.getString("name"));
        student.setEmail(rs.getString("email"));
        student.setPassword(rs.getString("password"));
        student.setGender(rs.getString("gender"));
        student.setCity(rs.getString("city"));

        return student;
    }

}
