package services;

import java.util.Date;

public class NonBoursier extends Etudiant
{
    public NonBoursier(String nom, String prenom, String email, String telephone, Date dateNaissance, String matricule, ResponsablePavillon monResponsable)
    {
        super(nom, prenom, email, telephone, dateNaissance, matricule, monResponsable);
    }

    private String adresse;

    /*
     * Getter and Setter Adresse
     */
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
