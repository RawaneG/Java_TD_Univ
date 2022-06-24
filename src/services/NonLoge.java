package services;

import java.util.ArrayList;

public class NonLoge extends Etudiant
{
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
