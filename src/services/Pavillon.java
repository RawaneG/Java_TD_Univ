package services;

import java.util.ArrayList;

import models.IModel;

public class Pavillon extends IModel
{
    private int id;
    private int numeroPavillon;
    private int nombreEtage;
    private ArrayList<Chambre> chambres;
    private ResponsablePavillon monResponsable;
    /*
     * Constructeur Pavillon
    */
    public Pavillon(int numeroPavillon, int nombreEtage, ResponsablePavillon monResponsable)
    {
        this.numeroPavillon = numeroPavillon;
        this.nombreEtage = nombreEtage;
        this.monResponsable = monResponsable;
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
     * Getter and Setter numéro du pavillon
     */
    public int getNumeroPavillon() {
        return numeroPavillon;
    }
    public void setNumeroPavillon(int numeroPavillon) {
        this.numeroPavillon = numeroPavillon;
    }
        /*
     * Getter and Setter nombre d'étage
     */
    public int getNombreEtage() {
        return nombreEtage;
    }
    public void setNombreEtage(int nombreEtage) {
        this.nombreEtage = nombreEtage;
    }
        /*
     * Getter and Setter mes chambres
     */
    public ArrayList<Chambre> getChambres() {
        return chambres;
    }
    public void setChambres(ArrayList<Chambre> chambres) {
        this.chambres = chambres;
    }
        /*
     * Getter and Setter mon responsable
     */
    public ResponsablePavillon getMonResponsable() {
        return monResponsable;
    }
    public void setMonResponsable(ResponsablePavillon monResponsable) {
        this.monResponsable = monResponsable;
    }
    @Override
    public String toString() {
        return "Pavillon [monResponsable=" + this.getMonResponsable() + ", nombreEtage=" + this.getNombreEtage() + ", numeroPavillon="
                + this.getNumeroPavillon() + "]";
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
}
