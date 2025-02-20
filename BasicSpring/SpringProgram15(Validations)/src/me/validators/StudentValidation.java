package me.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import me.beans.Student;

// ye class ka main motive ye hai ki aap galat value na insert kariye methods mein 
// proper value insert krenge to hi chalega program
public class StudentValidation implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		boolean b = Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student student = (Student) target;
		
		if(student.getMarks() > 100) {
			errors.reject("Not Valid Marks Provided");
		}
		
		if(student.getRollno() == 0) {
			errors.reject("Roll Number Cannot Be Zero");
		}
		
		
	}

}
