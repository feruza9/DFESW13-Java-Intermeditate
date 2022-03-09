package com.qa.mockitoExample;

public class ColourClass {

	public ObjectExample addColour(ObjectExample blankObject, String string) {
		
		blankObject.setColour(string);
		return blankObject;
		
	}
	
	public String returnColour() {
		return "Red";
	}

}
