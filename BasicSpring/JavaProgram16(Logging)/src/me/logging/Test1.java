package me.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("Hello one");
		
		// yaha pr hum getLogger mein class ka name eas liye provide kr rahe hai 
		// kyuki usko pata chale ye jo logger object wo kis class ke andar humne banaya hai  
		Logger logger = Logger.getLogger("Test1");
		
		logger.log(Level.SEVERE,"This is an important Message");
		logger.log(Level.INFO, "This is an information");
		logger.log(Level.WARNING,"This is an warning");
		
		System.out.println("Hello two");
	}
}


// ye output dega 

//Hello one
//Feb 20, 2025 3:34:31 PM me.logging.Test1 main
//SEVERE: This is an important Message
//Feb 20, 2025 3:34:31 PM me.logging.Test1 main
//INFO: This is an information
//Feb 20, 2025 3:34:31 PM me.logging.Test1 main
//WARNING: This is an warning
//Hello two



// set level se hum kis level tak ka logger execute hoga wo set krwa 
// skte hai 