package me.beans;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("Jaadu")
	private String name;
	
	@Value("hindi sanskrit maths science physics")
	private List<String> subjectList;
	
	@Value("#{${unknownMap :'C':87,'Java':98}}")
	private Map<String, Integer> map;
//	
	@Value("98")
	private int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public List<String> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<String> subjectList) {
		this.subjectList = subjectList;
	}

	public Map<String, Integer> getMap() {
		return map;
	}
	public void setMap(Map<String, Integer> map) {
		this.map = map;
	}

	public void display() {
		System.out.println("Name "+name);
		System.out.println("Roll "+roll);
		System.out.println("SubjectList "+subjectList);
		System.out.println("Map "+map);
	}
	
}
