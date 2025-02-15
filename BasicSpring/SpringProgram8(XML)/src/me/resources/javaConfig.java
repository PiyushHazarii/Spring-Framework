package me.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;

import me.beans.Student;

public class javaConfig {
	
	@Bean
	public Student std() {
		Student std = new Student();
		std.setName("piyush");
		std.setRoll(201);
		
//		we can use list to set the value in the arraylist 
		List<String> list = new ArrayList<>();
		list.add("PIYUSH");
		list.add("AMAN");
		list.add("BRO");
		std.setSubjectList(list);
		
//		we need a map to set the value in the map
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Sanjy",99);
		map.put("Bharti", 88);
		map.put("Jatin", 66);
		std.setMap(map);
		
		
		return std;
	}
}
