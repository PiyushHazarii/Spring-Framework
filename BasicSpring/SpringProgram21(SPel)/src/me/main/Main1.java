package me.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main1 {
	public static void main(String[] args) {
		// ye expression ko parse krne ke liye use hota hai 
		ExpressionParser parser = new SpelExpressionParser();
		// expression mein hum string de rahe hai and ExpressionParser internally check 
		// kr raha hai ki wo string sahi hai ya nhi hai sara space wagera hata kr
		// agar sahi hoga to program chalega nhi ot program mein error aayega 
		Expression expression = parser.parseExpression("  'Piyush Hazari ' ");
		
		// expression ka object se hum value get kr rahe hai jo ki ek object ke 
		// form mnein value return kr raha hai then wo store kr rae hai object mein 
		// then print kr rahe hai 
		Object object = expression.getValue();
		System.out.println(object);
		
	}
}

// standarad evaluation conxtext is used for setting the value in runtime 