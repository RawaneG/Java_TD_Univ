package services;

import java.util.ArrayList;

public class Chambre
{
    private int id;
    private String numeroChambre;
    private String numeroEtage;
    private boolean typeChambre;
    private Pavillon monPavillon;
    private ResponsablePavillon monResponsable;
    private ArrayList monLogeur;
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
    public String getNumeroChambre() {
        return numeroChambre;
    }
    public void setNumeroChambre(String numeroChambre) {
        this.numeroChambre = numeroChambre;
    }
    /*
     * Getter and Setter Numéro d'Étage
     */
    public String getNumeroEtage() {
        return numeroEtage;
    }
    public void setNumeroEtage(String numeroEtage) {
        this.numeroEtage = numeroEtage;
    }
    /*
     * Getter and Setter Type de Chambre
     */
    public boolean isTypeChambre() {
        return typeChambre;
    }
    public void setTypeChambre(boolean typeChambre) {
        this.typeChambre = typeChambre;
    }
}
