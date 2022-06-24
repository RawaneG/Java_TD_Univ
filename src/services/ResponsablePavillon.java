package services;

import java.util.ArrayList;

public class ResponsablePavillon
{
    private int id;
    private String login;
    private String password;
    private ArrayList<?> etudiants;
    private ArrayList<?> mesPavillons;
    private ArrayList<?> mesChambres;
    /*
     * Getter and Setter mes chambres
     */
    public ArrayList<?> getMesChambres()
    {
        return mesChambres;
    }
    public void setMesChambres(ArrayList<?> mesChambres)
    {
        this.mesChambres = mesChambres;
    }
    /*
     * Getter and Setter mes pavillons
     */
    public ArrayList<?> getMesPavillons()
    {
        return mesPavillons;
    }
    public void setMesPavillons(ArrayList<?> mesPavillons)
    {
        this.mesPavillons = mesPavillons;
    }
    /*
     * Getter and Setter Etudiants
     */
    public ArrayList<?> getEtudiants()
    {
        return etudiants;
    }
    public void setEtudiants(ArrayList<?> etudiants)
    {
        this.etudiants = etudiants;
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
     * Getter and Setter Login
     */
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    /*
     * Getter and Setter Password
     */
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
