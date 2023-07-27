package com.pluralsight.structural.decarator;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class DecoratorEverydayDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("output.txt");
		
		OutputStream outputStream= new FileOutputStream(file);
		DataOutputStream dataOstream = new  DataOutputStream(outputStream);
		dataOstream.writeChars("text");
		
		dataOstream.close();
		outputStream.close();
		
		
		
	}

}
