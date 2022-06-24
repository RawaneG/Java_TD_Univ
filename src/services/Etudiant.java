package services;

import java.util.Date;

public class Etudiant
{
    protected int id;
    protected String nom;
    protected String prenom;
    protected String email;
    protected String telephone;
    protected Date dateNaissance;
    protected String matricule;
    private ResponsablePavillon monResponsable;

    public Etudiant()
    {

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
     * Getter and Setter Nom
     */
    public String getNom()
    {
        return nom;
    }
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    /*
     * Getter and Setter Prénom
     */
    public String getPrenom()
    {
        return prenom;
    }
    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }
    /*
     * Getter and Setter Email
     */
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    /*
     * Getter and Setter Téléphone
     */
    public String getTelephone()
    {
        return telephone;
    }
    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }
    /*
     * Getter and Setter Date de Naissance
     */
    public Date getDateNaissance()
    {
        return dateNaissance;
    }
    public void setDateNaissance(Date dateNaissance)
    {
        this.dateNaissance = dateNaissance;
    }
    /*
     * Getter and Setter Matricule
     */
    public String getMatricule()
    {
        return matricule;
    }
    public void setMatricule(String matricule)
    {
        this.matricule = matricule;
    }

}
