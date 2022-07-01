package services;

import java.util.ArrayList;
import java.util.Date;

public class Loge extends Etudiant
{
    public Loge(String nom, String prenom, String email, String telephone, Date dateNaissance, String matricule, ResponsablePavillon monResponsable)
    {
        super(nom, prenom, email, telephone, dateNaissance, matricule, monResponsable);
    }
    private int id;
    private ArrayList<Bourse> bourses;
    private Chambre maChambre;
    /*
     * Getter and Setter ma chambre
     */
    public Chambre getMaChambre() {
        return maChambre;
    }
    public void setMaChambre(Chambre maChambre) {
        this.maChambre = maChambre;
    }
    /*
     * Getter and Setter mes bourses
     */
    public ArrayList<Bourse> getBourses() {
        return bourses;
    }
    public void setBourses(ArrayList<Bourse> bourses) {
        this.bourses = bourses;
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
    @Override
    public String toString() {
        return "Etudiant Logé [dateNaissance=" + dateNaissance + ", email=" + email + ", id=" + id + ", matricule="
                + matricule + ", monResponsable=" + monResponsable + ", nom=" + nom + ", prenom=" + prenom
                + ", telephone=" + telephone + ", ma bourse=" + bourses + ", ma Chambre=" + maChambre + "]";
    }
}
