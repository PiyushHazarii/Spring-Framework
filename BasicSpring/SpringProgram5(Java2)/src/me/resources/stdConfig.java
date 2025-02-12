package me.resources;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("me.beans") // yaha pr humko bean object create krne ke zarurat nhi hai
							// wo dekhega kaha pr component hai wo uska bean bana dega
// if there are multiple packages then use this 
//@ComponentScan({"me.beans","me.beans2"})  or
//@ComponentScan(basePackageClasses = {"me.beans","me.beans1"})
public class stdConfig {
	
	
}
