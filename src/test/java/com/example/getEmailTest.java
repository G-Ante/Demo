package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class getEmailTest {
    private Utente utente;

    // Setup method to create an instance of Utente before each test
    @BeforeEach
    public void setUp() {
        utente = new Utente("John", "Doe", "johndoe@example.com", "password", 25);
    }

    // Test case to verify the getEmail method returns the correct email
    @Test
    public void testGetEmail() {
        String expectedEmail = "johndoe@example.com";
        String actualEmail = utente.getEmail();
        assertEquals(expectedEmail, actualEmail);
    }
}
