package services;

import java.util.ArrayList;

public class Chambre
{
    private int id;
    private int numeroChambre;
    private int numeroEtage;
    private String typeChambre;
    private Pavillon monPavillon;
    private ResponsablePavillon monResponsable;
    private ArrayList<Loge> monLogeur;


    public Chambre(int numeroChambre, int numeroEtage, String typeChambre, Pavillon monPavillon) {
        this.numeroChambre = numeroChambre;
        this.numeroEtage = numeroEtage;
        this.typeChambre = typeChambre;
        this.monPavillon = monPavillon;
    }
    public ArrayList<Loge> getMonLogeur() {
        return monLogeur;
    }
    public void setMonLogeur(ArrayList<Loge> monLogeur) {
        this.monLogeur = monLogeur;
    }
    /*
     * Getter and Setter du responsable de pavillon
     */
    public ResponsablePavillon getMonResponsable() {
        return monResponsable;
    }
    public void setMonResponsable(ResponsablePavillon monResponsable) {
        this.monResponsable = monResponsable;
    }
    /*
     * Getter and Setter Nom Pavillon
     */
    public Pavillon getMonPavillon() {
        return monPavillon;
    }
    public void setMonPavillon(Pavillon monPavillon) {
        this.monPavillon = monPavillon;
    }
    /*
     * Getter and Setter Id
     */
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    /*
     * Getter and Setter Numéro de Chambre
     */
    public int getNumeroChambre() {
        return numeroChambre;
    }
    public void setNumeroChambre(int numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    /*
     * Getter and Setter Numéro d'Étage
     */
    public int getNumeroEtage() {
        return numeroEtage;
    }
    public void setNumeroEtage(int numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
    /*
     * Getter and Setter Type de Chambre
     */
    public String isTypeChambre() {
        return typeChambre;
    }
    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }

    public static Object[] add(int newTaille, Object newElement, Object[] myArray)
    {
        Object[] newArray = new Object[newTaille + 1];
        for (int i = 0; i < newTaille; i++)
        {
            newArray[i] = myArray[i];
        }
        newArray[newTaille] = newElement;
        return newArray;
    }

    public static void list(Object[] monTabkeau)
    {
        for (int i = 0; i < monTabkeau.length; i++)
        {
            System.out.println(monTabkeau[i]);
        }
    }
    @Override
    public String toString() {
        return "Chambre [monPavillon=" + monPavillon + ", numeroChambre=" + numeroChambre + ", numeroEtage=" + numeroEtage + ", typeChambre=" + typeChambre + "]";
    }
}
