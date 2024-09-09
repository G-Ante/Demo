package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class UtenteTest {

    @Test
    public void testConstructor() {
        // Given
        String nome = "John";
        String cognome = "Doe";
        String email = "johndoe@example.com";
        String password = "password123";
        int eta = 25;

        // When
        Utente utente = new Utente(nome, cognome, email, password, eta);

        // Then
        assertEquals(nome, utente.getNome());
        assertEquals(cognome, utente.getCognome());
        assertEquals(email, utente.getEmail());
        assertEquals(password, utente.getPassword());
        assertEquals(eta, utente.getEta());
    }
}
