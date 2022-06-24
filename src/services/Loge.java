package services;

import java.util.ArrayList;

public class Loge extends Etudiant
{
    private int id;
    private ArrayList<?> bourses;
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
