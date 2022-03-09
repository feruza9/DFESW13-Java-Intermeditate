package com.qa.mockitoExample;

public class ShapeClass {
	
	public ObjectExample addShape(ObjectExample object, String shape) {
		
		ObjectExample newObject = object;
		newObject.setShape(shape); 
		return newObject;
		
		
	}

}
