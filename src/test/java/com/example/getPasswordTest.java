package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class getPasswordTest {
    
    @Test
    public void testGetPassword() {
        // Arrange
        String expectedPassword = "password123";
        Utente utente = new Utente("John", "Doe", "john.doe@example.com", expectedPassword, 25);
        
        // Act
        String actualPassword = utente.getPassword();
        
        // Assert
        assertEquals(expectedPassword, actualPassword);
    }
}
