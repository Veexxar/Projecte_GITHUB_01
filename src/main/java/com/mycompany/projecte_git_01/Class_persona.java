package com.mycompany.projecte_git_01;

public class Class_Persona {
    
    private final String nom;
    private final int edat;
    
    //Constructor
    public Class_Persona(String nom, int edat)
    {
        this.nom = nom;
        this.edat = edat;
    }
    
    // Mètode per saludar
    public void saludar() {
        System.out.println("Hola, soc en " + nom + " i tinc " + edat + " anys.");
    }
    
    // Altres mètdes o atributs poden ser afegits aquí.
}
