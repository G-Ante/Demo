package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class tostringTest {

    private Utente utente;

    @BeforeEach
    public void setUp() {
        utente = new Utente("John", "Doe", "john.doe@example.com", "password123", 25);
    }

//     @Test
//     public void testToString() {
//         String expected = "Nome: John\nCognome: Doe\nEmail: john.doe@example.com\nEtà: 25\n";
//         assertEquals(expected, utente.toString());
//     }

//     @Test
//     public void testToStringEmptyFields() {
//         utente.setNome("");
//         utente.setCognome("");
//         String expected = "Nome: \nCognome: \nEmail: john.doe@example.com\nEtà: 25\n";
//         assertEquals(expected, utente.toString());
//     }

//     @Test
//     public void testToStringNullFields() {
//         utente.setNome(null);
//         utente.setCognome(null);
//         String expected = "Nome: null\nCognome: null\nEmail: john.doe@example.com\nEtà: 25\n";
//         assertEquals(expected, utente.toString());
//     }

//     @Test
//     public void testToStringNegativeAge() {
//         utente.setEta(-10);
//         String expected = "Nome: John\nCognome: Doe\nEmail: john.doe@example.com\nEtà: -10\n";
//         assertEquals(expected, utente.toString());
//     }
}
