/*
 * Package pour les classes métier
 */
package Entites;

import java.util.Date;

/**
 *
 * @author Sandrine Ociepka
 * @author Stephane Coulon
 * @version 1.0
 */
 /** Classe métier des prospects
 */
public class Prospect extends Societe {

    public Prospect(String nomsociete, String adresse1, String adresse2, String cp, String ville, String pays, String emailsociete, String telfixsociete, String telportsociete, String siret, int numrepresentant, String nomcontact, String prenomcontact, Date datedernierevisite) {
        super(nomsociete, adresse1, adresse2, cp, ville, pays, emailsociete, telfixsociete, telportsociete, siret, numrepresentant, nomcontact, prenomcontact, datedernierevisite);
    }

    public String getNomsociete() {
        return nomsociete;
    }

    public void setNomsociete(String nomsociete) {
        this.nomsociete = nomsociete;
    }
/** Getter de l'adresse */
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
    
}
