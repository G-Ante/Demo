package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class getCognomeTest {

    private Utente utente;

    @BeforeEach
    public void setUp() {
        utente = new Utente("John", "Doe", "johndoe@example.com", "password123", 25);
    }

    @Test
    public void testGetCognome() {
        String cognome = utente.getCognome();
        assertEquals("Doe", cognome);
    }

}
