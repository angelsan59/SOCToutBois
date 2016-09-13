/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "prospects")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prospects.findAll", query = "SELECT p FROM Prospects p")})
public class Prospects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numprospect")
    private Integer numprospect;
    @Basic(optional = false)
    @Column(name = "prenseigne")
    private String prenseigne;
    @Basic(optional = false)
    @Column(name = "prsiret")
    private int prsiret;
    @Basic(optional = false)
    @Column(name = "prdatevisite")
    @Temporal(TemporalType.DATE)
    private Date prdatevisite;
    @Basic(optional = false)
    @Column(name = "pradresse1")
    private String pradresse1;
    @Basic(optional = false)
    @Column(name = "pradresse2")
    private String pradresse2;
    @Basic(optional = false)
    @Column(name = "prcodepostal")
    private String prcodepostal;
    @Basic(optional = false)
    @Column(name = "prville")
    private String prville;
    @Basic(optional = false)
    @Column(name = "prpays")
    private String prpays;
    @Basic(optional = false)
    @Column(name = "nomprospect")
    private String nomprospect;
    @Basic(optional = false)
    @Column(name = "prenomprospect")
    private String prenomprospect;
    @Basic(optional = false)
    @Column(name = "prtelfixe")
    private int prtelfixe;
    @Basic(optional = false)
    @Column(name = "prtelportable")
    private int prtelportable;
    @Basic(optional = false)
    @Column(name = "premail")
    private String premail;

    public Prospects() {
    }

    public Prospects(Integer numprospect) {
        this.numprospect = numprospect;
    }

    public Prospects(Integer numprospect, String prenseigne, int prsiret, Date prdatevisite, String pradresse1, String pradresse2, String prcodepostal, String prville, String prpays, String nomprospect, String prenomprospect, int prtelfixe, int prtelportable, String premail) {
        this.numprospect = numprospect;
        this.prenseigne = prenseigne;
        this.prsiret = prsiret;
        this.prdatevisite = prdatevisite;
        this.pradresse1 = pradresse1;
        this.pradresse2 = pradresse2;
        this.prcodepostal = prcodepostal;
        this.prville = prville;
        this.prpays = prpays;
        this.nomprospect = nomprospect;
        this.prenomprospect = prenomprospect;
        this.prtelfixe = prtelfixe;
        this.prtelportable = prtelportable;
        this.premail = premail;
    }

    public Integer getNumprospect() {
        return numprospect;
    }

    public void setNumprospect(Integer numprospect) {
        this.numprospect = numprospect;
    }

    public String getPrenseigne() {
        return prenseigne;
    }

    public void setPrenseigne(String prenseigne) {
        this.prenseigne = prenseigne;
    }

    public int getPrsiret() {
        return prsiret;
    }

    public void setPrsiret(int prsiret) {
        this.prsiret = prsiret;
    }

    public Date getPrdatevisite() {
        return prdatevisite;
    }

    public void setPrdatevisite(Date prdatevisite) {
        this.prdatevisite = prdatevisite;
    }

    public String getPradresse1() {
        return pradresse1;
    }

    public void setPradresse1(String pradresse1) {
        this.pradresse1 = pradresse1;
    }

    public String getPradresse2() {
        return pradresse2;
    }

    public void setPradresse2(String pradresse2) {
        this.pradresse2 = pradresse2;
    }

    public String getPrcodepostal() {
        return prcodepostal;
    }

    public void setPrcodepostal(String prcodepostal) {
        this.prcodepostal = prcodepostal;
    }

    public String getPrville() {
        return prville;
    }

    public void setPrville(String prville) {
        this.prville = prville;
    }

    public String getPrpays() {
        return prpays;
    }

    public void setPrpays(String prpays) {
        this.prpays = prpays;
    }

    public String getNomprospect() {
        return nomprospect;
    }

    public void setNomprospect(String nomprospect) {
        this.nomprospect = nomprospect;
    }

    public String getPrenomprospect() {
        return prenomprospect;
    }

    public void setPrenomprospect(String prenomprospect) {
        this.prenomprospect = prenomprospect;
    }

    public int getPrtelfixe() {
        return prtelfixe;
    }

    public void setPrtelfixe(int prtelfixe) {
        this.prtelfixe = prtelfixe;
    }

    public int getPrtelportable() {
        return prtelportable;
    }

    public void setPrtelportable(int prtelportable) {
        this.prtelportable = prtelportable;
    }

    public String getPremail() {
        return premail;
    }

    public void setPremail(String premail) {
        this.premail = premail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numprospect != null ? numprospect.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prospects)) {
            return false;
        }
        Prospects other = (Prospects) object;
        if ((this.numprospect == null && other.numprospect != null) || (this.numprospect != null && !this.numprospect.equals(other.numprospect))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Application.Prospects[ numprospect=" + numprospect + " ]";
    }
    
}
