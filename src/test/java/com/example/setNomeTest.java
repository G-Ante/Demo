package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class setNomeTest {

    private Utente utente;

    @BeforeEach
    void setUp() {
        utente = new Utente("John", "Doe", "john.doe@example.com", "password", 25);
    }

    @Test
    void testSetNome() {
        utente.setNome("Jane");
        assertEquals("Jane", utente.getNome());
    }
}
