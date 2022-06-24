package services;

import java.util.ArrayList;

public class Pavillon
{
    private int id;
    private String numeroPavillon;
    private String nombreEtage;
    private ArrayList<?> chambres;
    private ResponsablePavillon monResponsable;
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
    public String getNumeroPavillon() {
        return numeroPavillon;
    }
    public void setNumeroPavillon(String numeroPavillon) {
        this.numeroPavillon = numeroPavillon;
    }
        /*
     * Getter and Setter nombre d'étage
     */
    public String getNombreEtage() {
        return nombreEtage;
    }
    public void setNombreEtage(String nombreEtage) {
        this.nombreEtage = nombreEtage;
    }
        /*
     * Getter and Setter mes chambres
     */
    public ArrayList<?> getChambres() {
        return chambres;
    }
    public void setChambres(ArrayList<?> chambres) {
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
}
