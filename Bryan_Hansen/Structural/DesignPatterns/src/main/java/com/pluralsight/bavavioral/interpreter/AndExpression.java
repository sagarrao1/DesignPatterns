package com.pluralsight.bavavioral.interpreter;

public class AndExpression implements Expression{

	private Expression expr1;
	private Expression expr2;
	
	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
		System.out.println("AndExpression constructor");
	}

	@Override
	public boolean interpret(String str) {
		System.out.println(expr1.interpret(str) && expr2.interpret(str));
		return expr1.interpret(str) && expr2.interpret(str);
	}

}
