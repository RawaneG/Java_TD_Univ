package services;

import java.util.ArrayList;
import java.util.Date;

public class NonLoge extends Etudiant
{
    public NonLoge(String nom, String prenom, String email, String telephone, Date dateNaissance, String matricule, ResponsablePavillon monResponsable)
    {
        super(nom, prenom, email, telephone, dateNaissance, matricule, monResponsable);
    }
    private int id;
    private ArrayList<?> bourses;
    /*
     * Getter and Setter de mes bourses
     */
    public ArrayList<?> getBourses() {
        return bourses;
    }
    public void setBourses(ArrayList<?> bourses) {
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
}
