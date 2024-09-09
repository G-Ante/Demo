package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class setEmailTest {
    private Utente utente;

    @BeforeEach
    public void setup() {
        utente = new Utente("John", "Doe", "johndoe@example.com", "password", 25);
    }

//     @Test
//     public void testSetEmail() {
//         // Test valid email
//         utente.setEmail("newemail@example.com");
//         assertEquals("newemail@example.com", utente.getEmail());
// 
//         // Test invalid email
//         utente.setEmail("invalidemail");
//         assertEquals("newemail@example.com", utente.getEmail());
//     }

//     @Test
//     public void testSetEmail_NullEmail() {
//         utente.setEmail(null);
//         assertNull(utente.getEmail());
//     }

//     @Test
//     public void testSetEmail_EmptyEmail() {
//         utente.setEmail("");
//         assertEquals("", utente.getEmail());
//     }

//     @Test
//     public void testSetEmail_WhitespaceEmail() {
//         utente.setEmail("     ");
//         assertEquals("     ", utente.getEmail());
//     }

//     @Test
//     public void testSetEmail_MaxLengthEmail() {
//         String maxLengthEmail = "a".repeat(255) + "@example.com";
//         utente.setEmail(maxLengthEmail);
//         assertEquals(maxLengthEmail, utente.getEmail());
//     }

//     @Test
//     public void testSetEmail_EmailWithSpecialCharacters() {
//         utente.setEmail("email^with#special!characters@example.com");
//         assertEquals("email^with#special!characters@example.com", utente.getEmail());
//     }
}
