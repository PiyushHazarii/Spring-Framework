package me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	public Student findByName(String name);
}
