/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Iram
 */
@Entity
@Table(name = "PULJE_B")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuljeB.findAll", query = "SELECT p FROM PuljeB p"),
    @NamedQuery(name = "PuljeB.findByValgfagid", query = "SELECT p FROM PuljeB p WHERE p.valgfagid = :valgfagid")})
public class PuljeB implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VALGFAGID")
    private Integer valgfagid;
    @JoinColumn(name = "VALGFAGID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Valgfag valgfag;

    public PuljeB() {
    }

    public PuljeB(Integer valgfagid) {
        this.valgfagid = valgfagid;
    }

    public Integer getValgfagid() {
        return valgfagid;
    }

    public void setValgfagid(Integer valgfagid) {
        this.valgfagid = valgfagid;
    }

    public Valgfag getValgfag() {
        return valgfag;
    }

    public void setValgfag(Valgfag valgfag) {
        this.valgfag = valgfag;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (valgfagid != null ? valgfagid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuljeB)) {
            return false;
        }
        PuljeB other = (PuljeB) object;
        if ((this.valgfagid == null && other.valgfagid != null) || (this.valgfagid != null && !this.valgfagid.equals(other.valgfagid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.PuljeB[ valgfagid=" + valgfagid + " ]";
    }
    
}
