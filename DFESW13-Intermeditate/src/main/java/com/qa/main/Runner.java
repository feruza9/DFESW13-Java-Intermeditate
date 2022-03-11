package com.qa.main;

import com.qa.exceptionsDemo.ExceptionsDemo;
import com.qa.exceptionsDemo.ExceptionsDivideExercise;

public class Runner {
	
	public static void main(String[] args) {
		
		// o _ _ _ _ t - Object
		ExceptionsDemo demo = new ExceptionsDemo();
		
//		demo.makeError();
//		demo.makeException();
//		demo.makeCustomException();
		
		ExceptionsDivideExercise exercise = new ExceptionsDivideExercise();
		System.out.println(exercise.divide(20, 5));
		
	}

}
