/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

import java.util.Date;

/**
 *
 * @author sociepka
 */
public class Client extends Societe {
    private int numclient ;
    private int nbcommandes ;

    public int getNumclient() {
        return numclient;
    }

    public void setNumclient(int numclient) {
        this.numclient = numclient;
    }

    public int getNbcommandes() {
        return nbcommandes;
    }

    public void setNbcommandes(int nbcommandes) {
        this.nbcommandes = nbcommandes;
    }

    public Client(String nomsociete, String adresse1, String adresse2, String cp, String ville, String pays, String emailsociete, String telfixsociete, String telportsociete, String siret, int numrepresentant, String nomcontact, String prenomcontact, Date datedernierevisite, int numclient, int nbcommandes) {
        super(nomsociete, adresse1, adresse2, cp, ville, pays, emailsociete, telfixsociete, telportsociete, siret, numrepresentant, nomcontact, prenomcontact, datedernierevisite);
        this.numclient = numclient;
        this.nbcommandes = nbcommandes;
    }
    
    
}
