package com.pluralsight.bavavioral.interpreter;

public class InterpreterDemo {

	static Expression buildInterpreterTree() {
		
		Expression terminal1 = new TerminalExpression("Lions");
		Expression terminal2 = new TerminalExpression("Tigers");
		Expression terminal3 = new TerminalExpression("Bears");
		
//		return terminal1;
		
//		Tigers and Bears
		AndExpression alteration1 = new AndExpression(terminal2, terminal3);
		
//		Lions or (Tigers and Bears)
		OrExpression alteration2 = new OrExpression(terminal1, alteration1);
		System.out.println(alteration2.getExpr1() , alteration2.getExpr2());
		
		return new AndExpression(terminal3, alteration2);
	}
	
	
	
	/*
	 * main method - build the interpreter and 
	 * then interpret the specific sequence
	 */ 
	public static void main(String[] args) {
//		String context="Lions";
		String context="Tigers";
//		String context="Bears";
//		String context="Lions Tigers";
//		String context="Lions Bears";

		Expression  define= buildInterpreterTree();
		System.out.println("Lions is "+ define.interpret(context));
	}

}
