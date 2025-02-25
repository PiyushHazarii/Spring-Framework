package me.main;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main1 {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("  'Piyush Hazari ' ");
		Object object = expression.getValue();
		System.out.println(object);
		
	}
}
