package com.pluralsight.bavavioral.interpreter;

public class OrExpression implements Expression{

	private Expression expr1;
	private Expression expr2;
	
	public OrExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}



	public Expression getExpr1() {
		return expr1;
	}



	public Expression getExpr2() {
		return expr2;
	}



	@Override
	public boolean interpret(String str) {
		return expr1.interpret(str) || expr2.interpret(str);
	}

}
