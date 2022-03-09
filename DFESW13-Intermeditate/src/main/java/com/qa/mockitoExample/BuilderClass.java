package com.qa.mockitoExample;

public class BuilderClass {
	
	private ShapeClass shapeClass = new ShapeClass();
	private ColourClass colourClass = new ColourClass();
	
	public String colourPrint() {
		String result = colourClass.returnColour();
		return result;
	}
	
	public ObjectExample createObject(String shape, String colour) {
		
		ObjectExample blankObject = new ObjectExample("blank", "blank");
		
		ObjectExample shapeObject = shapeClass.addShape(blankObject, shape);
		System.out.println(blankObject);
		
		blankObject = colourClass.addColour(blankObject, colour);
		
		return blankObject;
	}

}
