package services;

import java.util.ArrayList;

public class Bourse
{
    private int id;
    private boolean type;
    private int montant;
    private ArrayList<NonLoge> nonloge;
    private ArrayList<Loge> loge;

    /*
     * Getter and Setter Logé
     */
    public ArrayList<Loge> getLoge() {
        return loge;
    }
    public void setLoge(ArrayList<Loge> loge) {
        this.loge = loge;
    }
    /*
     * Getter and Setter Non Logé
     */
    public ArrayList<NonLoge> getNonloge() {
        return nonloge;
    }
    public void setNonloge(ArrayList<NonLoge> nonloge) {
        this.nonloge = nonloge;
    }
    /*
     * Getter and Setter Id
     */
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    /*
     * Getter and Setter Type
     */
    public boolean isType()
    {
        return type;
    }
    public void setType(boolean type)
    {
        this.type = type;
    }
    /*
     * Getter and Setter Montant
     */
    public int getMontant()
    {
        return montant;
    }
    public void setMontant(int montant)
    {
        this.montant = montant;
    }
}
