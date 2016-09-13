/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysqltest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sociepka
 */
@Entity
@Table(name = "representants")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Representants.findAll", query = "SELECT r FROM Representants r"),
    @NamedQuery(name = "Representants.findByNumrep", query = "SELECT r FROM Representants r WHERE r.numrep = :numrep"),
    @NamedQuery(name = "Representants.findByNomrep", query = "SELECT r FROM Representants r WHERE r.nomrep = :nomrep"),
    @NamedQuery(name = "Representants.findByPrenomrep", query = "SELECT r FROM Representants r WHERE r.prenomrep = :prenomrep"),
    @NamedQuery(name = "Representants.findBySalaire", query = "SELECT r FROM Representants r WHERE r.salaire = :salaire"),
    @NamedQuery(name = "Representants.findByTxcommission", query = "SELECT r FROM Representants r WHERE r.txcommission = :txcommission")})
public class Representants implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "numrep")
    private Integer numrep;
    @Basic(optional = false)
    @Column(name = "nomrep")
    private String nomrep;
    @Basic(optional = false)
    @Column(name = "prenomrep")
    private String prenomrep;
    @Basic(optional = false)
    @Column(name = "salaire")
    private int salaire;
    @Basic(optional = false)
    @Column(name = "txcommission")
    private float txcommission;

    public Representants() {
    }

    public Representants(Integer numrep) {
        this.numrep = numrep;
    }

    public Representants(Integer numrep, String nomrep, String prenomrep, int salaire, float txcommission) {
        this.numrep = numrep;
        this.nomrep = nomrep;
        this.prenomrep = prenomrep;
        this.salaire = salaire;
        this.txcommission = txcommission;
    }

    public Integer getNumrep() {
        return numrep;
    }

    public void setNumrep(Integer numrep) {
        this.numrep = numrep;
    }

    public String getNomrep() {
        return nomrep;
    }

    public void setNomrep(String nomrep) {
        this.nomrep = nomrep;
    }

    public String getPrenomrep() {
        return prenomrep;
    }

    public void setPrenomrep(String prenomrep) {
        this.prenomrep = prenomrep;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public float getTxcommission() {
        return txcommission;
    }

    public void setTxcommission(float txcommission) {
        this.txcommission = txcommission;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numrep != null ? numrep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Representants)) {
            return false;
        }
        Representants other = (Representants) object;
        if ((this.numrep == null && other.numrep != null) || (this.numrep != null && !this.numrep.equals(other.numrep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Application.Representants[ numrep=" + numrep + " ]";
    }
    
}
