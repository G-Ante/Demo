package com.example;

public class Utente {
    // Attributi
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private int eta;

    // Costruttore
    public Utente(String nome, String cognome, String email, String password, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.eta = eta;
    }

    // Metodi getter
    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getEta() {
        return eta;
    }

    // Metodi setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEta(int eta) {
        if (eta > 0) {
            this.eta = eta;
        } else {
            System.out.println("L'età deve essere un valore positivo.");
        }
    }

    // Metodo per mostrare le informazioni dell'utente
    public void tostring() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Email: " + email);
        System.out.println("Età: " + eta);
    }

}
