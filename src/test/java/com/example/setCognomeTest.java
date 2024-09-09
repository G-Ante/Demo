package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class setCognomeTest {

    private Utente utente;

    @BeforeEach
    public void setUp() {
        utente = new Utente("John", "Doe", "john.doe@example.com", "password", 25);
    }

    @Test
    public void testSetCognome() {
        utente.setCognome("Smith");
        assertEquals("Smith", utente.getCognome());
    }

//     @Test
//     public void testSetCognome_Null() {
//         utente.setCognome(null);
//         assertEquals("Doe", utente.getCognome());
//     }

//     @Test
//     public void testSetCognome_EmptyString() {
//         utente.setCognome("");
//         assertEquals("Doe", utente.getCognome());
//     }

//     @Test
//     public void testSetCognome_Uppercase() {
//         utente.setCognome("SMITH");
//         assertEquals("smith", utente.getCognome());
//     }

    @Test
    public void testSetCognome_SpecialCharacters() {
        utente.setCognome("D@e");
        assertEquals("D@e", utente.getCognome());
    }
}
