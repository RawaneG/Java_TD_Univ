package services;

import java.util.ArrayList;

import models.IService;

public class Bourse implements IService
{
    private int id;
    private boolean type;
    private int montant;
    private ArrayList<?> nonloge;
    private ArrayList<?> loge;

    /*
     * Getter and Setter Logé
     */
    public ArrayList<?> getLoge() {
        return loge;
    }
    public void setLoge(ArrayList<?> loge) {
        this.loge = loge;
    }
    /*
     * Getter and Setter Non Logé
     */
    public ArrayList<?> getNonloge() {
        return nonloge;
    }
    public void setNonloge(ArrayList<?> nonloge) {
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
    @Override
    public void add()
    {

    }
    @Override
    public void edit()
    {

    }
    @Override
    public void list()
    {

    }
    @Override
    public void remove()
    {

    }
}
