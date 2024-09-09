package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import com.example.Utente;

public class setPasswordTest {
    
    private Utente utente;
    
    @BeforeEach
    public void setup() {
        utente = new Utente("John", "Doe", "johndoe@example.com", "password123", 25);
    }
    
    @Test
    public void testSetPassword() {
        // Test valid password
        utente.setPassword("newpassword");
        assertEquals("newpassword", utente.getPassword(), "Failed to set valid password");
        
        // Test empty password
        utente.setPassword("");
        assertEquals("", utente.getPassword(), "Failed to set empty password");
        
        // Test null password
        utente.setPassword(null);
        assertNull(utente.getPassword(), "Failed to set null password");
    }
}
