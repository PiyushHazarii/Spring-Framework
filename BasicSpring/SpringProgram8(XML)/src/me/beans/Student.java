package me.beans;

import java.util.List;
import java.util.Map;

public class Student {
	private String name;
	
	private List<String> subjectList;
	
	private Map<String, Integer> map;
	

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
