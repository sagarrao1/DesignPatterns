package com.pluralsight.bavavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EverydayDemo {

	public static void main(String[] args) {
		String input ="Lions and tigers and bears! oh my!";
		Pattern p =  Pattern.compile("(lion|cat|dog|tiger|human|bear|liger)");
		Matcher m = p.matcher(input);
		
		
		while (m.find()) {
			System.out.println("Found a "+m.group()+ ".");
		}
	}

}
