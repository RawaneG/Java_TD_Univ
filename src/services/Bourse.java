package services;

import java.util.ArrayList;

import models.IService;

public class Bourse implements IService
{
    private int id;
    private boolean type;
    private int montant;
    private ArrayList nonloge;
    private ArrayList loge;
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
    public void add() {
        // TODO Auto-generated method stub

    }
    @Override
    public void edit() {
        // TODO Auto-generated method stub

    }
    @Override
    public void list() {
        // TODO Auto-generated method stub

    }
    @Override
    public void remove() {
        // TODO Auto-generated method stub

    }
}
