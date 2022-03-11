package com.qa.exceptionsDemo;

public class ExceptionsDivideExercise {
	
	public int divide(int x, int y) {
		
		int result = 0;
		
		try {
			result = x / y;
			
			if( y > x) {
				throw new LargerNumberException(y + " is larger than " + x);
			}
			
		} catch (Exception exception) {
			exception.printStackTrace();
			
		} finally {
			System.out.println("It hasn't crashed the app");

			
		}
		return result;
		
	}

}
