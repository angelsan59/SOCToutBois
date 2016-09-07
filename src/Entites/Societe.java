/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import java.util.Date;

/**
 *
 * @author Sandrine Ociepka
 * @author Stephane Coulon
 */
public class Societe {
    /*
    * === Définition des coordonnées du client ou du propect ===
    */
    protected String nomsociete ;
    protected String adresse1 ;
    protected String adresse2 ;
    protected String cp ;
    protected String ville ;
    protected String pays ;
    protected String emailsociete ;
    protected String telfixsociete ;
    protected String telportsociete ;
    protected String siret ;
    protected int numrepresentant ;
    /*
    * === Définition du contact client ou propect ===
    */
    protected String nomcontact ;
    protected String prenomcontact ;
    protected Date datedernierevisite ;

    
    
    public String getNomsociete() {
        return nomsociete;
    }

    public void setNomsociete(String nomsociete) {
        this.nomsociete = nomsociete;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getEmailsociete() {
        return emailsociete;
    }

    public void setEmailsociete(String emailsociete) {
        this.emailsociete = emailsociete;
    }

    public String getTelfixsociete() {
        return telfixsociete;
    }

    public void setTelfixsociete(String telfixsociete) {
        this.telfixsociete = telfixsociete;
    }

    public String getTelportsociete() {
        return telportsociete;
    }

    public void setTelportsociete(String telportsociete) {
        this.telportsociete = telportsociete;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public int getNumrepresentant() {
        return numrepresentant;
    }

    public void setNumrepresentant(int numrepresentant) {
        this.numrepresentant = numrepresentant;
    }

    public String getNomcontact() {
        return nomcontact;
    }

    public void setNomcontact(String nomcontact) {
        this.nomcontact = nomcontact;
    }

    public String getPrenomcontact() {
        return prenomcontact;
    }

    public void setPrenomcontact(String prenomcontact) {
        this.prenomcontact = prenomcontact;
    }

    public Date getDatedernierevisite() {
        return datedernierevisite;
    }

    public void setDatedernierevisite(Date datedernierevisite) {
        this.datedernierevisite = datedernierevisite;
    }

    public Societe(String nomsociete, String adresse1, String adresse2, String cp, String ville, String pays, String emailsociete, String telfixsociete, String telportsociete, String siret, int numrepresentant, String nomcontact, String prenomcontact, Date datedernierevisite) {
        this.nomsociete = nomsociete;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.cp = cp;
        this.ville = ville;
        this.pays = pays;
        this.emailsociete = emailsociete;
        this.telfixsociete = telfixsociete;
        this.telportsociete = telportsociete;
        this.siret = siret;
        this.numrepresentant = numrepresentant;
        this.nomcontact = nomcontact;
        this.prenomcontact = prenomcontact;
        this.datedernierevisite = datedernierevisite;
    }
    
    
}
