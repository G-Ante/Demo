package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class getNomeTest {

    private Utente utente;

    @BeforeEach
    public void setUp() {
        utente = new Utente("John", "Doe", "johndoe@example.com", "password123", 25);
    }

    @Test
    public void testGetNome() {
        assertEquals("John", utente.getNome());
    }

}
