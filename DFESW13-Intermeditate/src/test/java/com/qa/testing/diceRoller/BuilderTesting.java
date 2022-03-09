package com.qa.testing.diceRoller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.mockitoExample.BuilderClass;
import com.qa.mockitoExample.ColourClass;
import com.qa.mockitoExample.ObjectExample;
import com.qa.mockitoExample.ShapeClass;

@ExtendWith(MockitoExtension.class)
public class BuilderTesting {
	
	@Mock
	ShapeClass mockShape;
	
	@Mock
	ColourClass mockColour;
	
	@InjectMocks
	BuilderClass builder;
	
	ObjectExample blankObject = new ObjectExample("blank", "blank");
	ObjectExample shapeObject = new ObjectExample("test", "blank");
	ObjectExample colourObject = new ObjectExample("blank", "test");
	ObjectExample finalObject = new ObjectExample("test", "test");
	
	@Test
	public void testColourPrint() {
		Mockito.when(mockColour.returnColour()).thenReturn("blue");
		
		Assertions.assertEquals(builder.colourPrint(), "blue");
		
		Mockito.verify(mockColour, Mockito.times(1)).returnColour();
	}
	
	@Test
	public void testCreateObject() {
		System.out.println(shapeObject);
		Mockito.when(mockShape.addShape(new ObjectExample("blank", "blank"), "test")).thenReturn(shapeObject);
//		Mockito.when(mockColour.addColour(blankObject, "test")).thenReturn(colourObject);
		
		System.out.println(builder.createObject("test", "test"));
	}
	
	

}
