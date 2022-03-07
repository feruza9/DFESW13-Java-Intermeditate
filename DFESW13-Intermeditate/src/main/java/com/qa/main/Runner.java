package com.qa.main;

import com.qa.exceptionsDemo.ExceptionsDemo;

public class Runner {
	
	public static void main(String[] args) {
		
		// o _ _ _ _ t - Object
		ExceptionsDemo demo = new ExceptionsDemo();
		
//		demo.makeError();
		demo.makeException();
		demo.nullPointer();
		
	}

}
