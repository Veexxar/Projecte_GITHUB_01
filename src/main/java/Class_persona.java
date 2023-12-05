public class Class_persona {
    
    private final String nom;
    private final int edat;
    
    //Constructor
    public Class_persona(String nom, int edat)
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
