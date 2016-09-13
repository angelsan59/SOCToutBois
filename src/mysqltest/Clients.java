/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqltest;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sociepka
 */
@Entity
@Table(name = "clients")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clients.findAll", query = "SELECT c FROM Clients c")})
public class Clients implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numclient")
    private Integer numclient;
    @Basic(optional = false)
    @Column(name = "clenseigne")
    private String clenseigne;
    @Basic(optional = false)
    @Column(name = "clsiret")
    private int clsiret;
    @Basic(optional = false)
    @Column(name = "cldatevisite")
    @Temporal(TemporalType.DATE)
    private Date cldatevisite;
    @Basic(optional = false)
    @Column(name = "cladresse1")
    private String cladresse1;
    @Basic(optional = false)
    @Column(name = "cladresse2")
    private String cladresse2;
    @Basic(optional = false)
    @Column(name = "clcodepostal")
    private String clcodepostal;
    @Basic(optional = false)
    @Column(name = "clville")
    private String clville;
    @Basic(optional = false)
    @Column(name = "clpays")
    private String clpays;
    @Basic(optional = false)
    @Column(name = "nomclient")
    private String nomclient;
    @Basic(optional = false)
    @Column(name = "prenomclient")
    private String prenomclient;
    @Basic(optional = false)
    @Column(name = "cltelfixe")
    private int cltelfixe;
    @Basic(optional = false)
    @Column(name = "cltelportable")
    private int cltelportable;
    @Basic(optional = false)
    @Column(name = "clemail")
    private String clemail;
    @Basic(optional = false)
    @Column(name = "nbcommandes")
    private int nbcommandes;

    public Clients() {
    }

    public Clients(Integer numclient) {
        this.numclient = numclient;
    }

    public Clients(Integer numclient, String clenseigne, int clsiret, Date cldatevisite, String cladresse1, String cladresse2, String clcodepostal, String clville, String clpays, String nomclient, String prenomclient, int cltelfixe, int cltelportable, String clemail, int nbcommandes) {
        this.numclient = numclient;
        this.clenseigne = clenseigne;
        this.clsiret = clsiret;
        this.cldatevisite = cldatevisite;
        this.cladresse1 = cladresse1;
        this.cladresse2 = cladresse2;
        this.clcodepostal = clcodepostal;
        this.clville = clville;
        this.clpays = clpays;
        this.nomclient = nomclient;
        this.prenomclient = prenomclient;
        this.cltelfixe = cltelfixe;
        this.cltelportable = cltelportable;
        this.clemail = clemail;
        this.nbcommandes = nbcommandes;
    }

    public Integer getNumclient() {
        return numclient;
    }

    public void setNumclient(Integer numclient) {
        this.numclient = numclient;
    }

    public String getClenseigne() {
        return clenseigne;
    }

    public void setClenseigne(String clenseigne) {
        this.clenseigne = clenseigne;
    }

    public int getClsiret() {
        return clsiret;
    }

    public void setClsiret(int clsiret) {
        this.clsiret = clsiret;
    }

    public Date getCldatevisite() {
        return cldatevisite;
    }

    public void setCldatevisite(Date cldatevisite) {
        this.cldatevisite = cldatevisite;
    }

    public String getCladresse1() {
        return cladresse1;
    }

    public void setCladresse1(String cladresse1) {
        this.cladresse1 = cladresse1;
    }

    public String getCladresse2() {
        return cladresse2;
    }

    public void setCladresse2(String cladresse2) {
        this.cladresse2 = cladresse2;
    }

    public String getClcodepostal() {
        return clcodepostal;
    }

    public void setClcodepostal(String clcodepostal) {
        this.clcodepostal = clcodepostal;
    }

    public String getClville() {
        return clville;
    }

    public void setClville(String clville) {
        this.clville = clville;
    }

    public String getClpays() {
        return clpays;
    }

    public void setClpays(String clpays) {
        this.clpays = clpays;
    }

    public String getNomclient() {
        return nomclient;
    }

    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }

    public String getPrenomclient() {
        return prenomclient;
    }

    public void setPrenomclient(String prenomclient) {
        this.prenomclient = prenomclient;
    }

    public int getCltelfixe() {
        return cltelfixe;
    }

    public void setCltelfixe(int cltelfixe) {
        this.cltelfixe = cltelfixe;
    }

    public int getCltelportable() {
        return cltelportable;
    }

    public void setCltelportable(int cltelportable) {
        this.cltelportable = cltelportable;
    }

    public String getClemail() {
        return clemail;
    }

    public void setClemail(String clemail) {
        this.clemail = clemail;
    }

    public int getNbcommandes() {
        return nbcommandes;
    }

    public void setNbcommandes(int nbcommandes) {
        this.nbcommandes = nbcommandes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numclient != null ? numclient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clients)) {
            return false;
        }
        Clients other = (Clients) object;
        if ((this.numclient == null && other.numclient != null) || (this.numclient != null && !this.numclient.equals(other.numclient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Application.Clients[ numclient=" + numclient + " ]";
    }
    
}
