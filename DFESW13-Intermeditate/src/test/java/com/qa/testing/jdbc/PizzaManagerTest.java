package com.qa.testing.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.qa.jdbcDemo.DBManager;
import com.qa.jdbcDemo.PizzaManager;

@ExtendWith(MockitoExtension.class)
public class PizzaManagerTest {
	
	@Mock 
	DBManager mockManager;
	
	@Mock
	Connection conn;
	
	@Mock
	Statement statement;
	
	PizzaManager manager;

	
	public void testDatabaseSetup() throws SQLException {
		
		// Arrange
		
		// Act
		Mockito.when(mockManager.connectDB()).thenReturn(conn);
		Mockito.when(conn.createStatement()).thenReturn(statement);
		// Assert
		
	}
	
	

}
