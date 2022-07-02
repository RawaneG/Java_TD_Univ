package services;

import java.util.ArrayList;

public class ResponsablePavillon
{
    private int id;
    private String nomComplet;
    private String login;
    private String password;
    private ArrayList<Etudiant> etudiants;
    private ArrayList<Pavillon> mesPavillons;
    private ArrayList<Chambre> mesChambres;
    /*
     * Constructeur nom Complet
     */
    public ResponsablePavillon(String nomComplet)
    {
        this.nomComplet = nomComplet;
    }
    /*
     * Getter nomComplet
     */
    public String getNomComplet()
    {
        return nomComplet;
    }
    public void setNomComplet(String nomComplet)
    {
        this.nomComplet = nomComplet;
    }
    /*
     * Getter and Setter mes chambres
     */
    public ArrayList<Chambre> getMesChambres()
    {
        return mesChambres;
    }
    public void setMesChambres(ArrayList<Chambre> mesChambres)
    {
        this.mesChambres = mesChambres;
    }
    /*
     * Getter and Setter mes pavillons
     */
    public ArrayList<Pavillon> getMesPavillons()
    {
        return mesPavillons;
    }
    public void setMesPavillons(ArrayList<Pavillon> mesPavillons)
    {
        this.mesPavillons = mesPavillons;
    }
    /*
     * Getter and Setter Etudiants
     */
    public ArrayList<Etudiant> getEtudiants()
    {
        return etudiants;
    }
    public void setEtudiants(ArrayList<Etudiant> etudiants)
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

    @Override
    public String toString() {
        return "ResponsablePavillon [nomComplet=" + nomComplet + "]";
    }
}
