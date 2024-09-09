package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class getEtaTest {

    private Utente utente;

    @BeforeEach
    public void setUp() {
        utente = new Utente("John", "Doe", "johndoe@example.com", "password", 25);
    }

    @Test
    public void testGetEta() {
        assertEquals(25, utente.getEta());
    }
}
