//package com.qa.mockitoTesting;
//
//import static org.mockito.Mockito.atLeastOnce;
//import static org.mockito.Mockito.verify;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.qa.mockitoExample.ClassOne;
//import com.qa.mockitoExample.ClassTwo;
//
//@ExtendWith(MockitoExtension.class)
//public class ClassOneTest {
//	
//	@Mock
//	ClassTwo mockedClass;
//	
//	ClassOne shapeClass = new ClassOne();
//	
////	@Test
//	public void testShapeString() {
//		
////		System.out.println("is this working..");
//		
//		// Arrange
//		Mockito.when(mockedClass.returnBlue()).thenReturn("Blue");
//		
//		// Act
//		String result = shapeClass.addShapeString();
//		
////		 Assert
//		Assertions.assertEquals("Blue triangle", result);
//		
//		Mockito.verify(mockedClass, atLeastOnce()).returnBlue();
//	
//	}
//	
//	
//	
//	
//
//}
