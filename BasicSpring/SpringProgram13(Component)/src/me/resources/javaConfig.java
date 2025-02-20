package me.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// component scan krne se humlog ko autowired use krne ka zarurat nhi hai wo khud se hi
// autowiring achieve kr lega 

// agar constructor use kr rahe hai to humko autowired ka use krne ki zarurat nhi hai
// but agar setter getter method use kr rahe hai to usme use hota hai autowired 
@Configuration
@ComponentScan(basePackages = "me.beans")
public class javaConfig {
	
}
