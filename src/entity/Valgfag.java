/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "VALGFAG")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Valgfag.findAll", query = "SELECT v FROM Valgfag v"),
    @NamedQuery(name = "Valgfag.findById", query = "SELECT v FROM Valgfag v WHERE v.id = :id"),
    @NamedQuery(name = "Valgfag.findByFag", query = "SELECT v FROM Valgfag v WHERE v.fag = :fag")
})
public class Valgfag implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FAG")
    private String fag;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "valgfag")
    private PuljeA puljeA;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "valgfag")
    private PuljeB puljeB;
    @OneToMany(mappedBy = "andenPrioritetb")
    private Collection<FørsteRunde> førsteRundeCollection;
    @OneToMany(mappedBy = "f\u00f8rstePrioritetb")
    private Collection<FørsteRunde> førsteRundeCollection1;
    @OneToMany(mappedBy = "andenPrioriteta")
    private Collection<FørsteRunde> førsteRundeCollection2;
    @OneToMany(mappedBy = "f\u00f8rstePrioriteta")
    private Collection<FørsteRunde> førsteRundeCollection3;

    public Valgfag()
    {
    }

    public Valgfag(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getFag()
    {
        return fag;
    }

    public void setFag(String fag)
    {
        this.fag = fag;
    }

    public PuljeA getPuljeA()
    {
        return puljeA;
    }

    public void setPuljeA(PuljeA puljeA)
    {
        this.puljeA = puljeA;
    }

    public PuljeB getPuljeB()
    {
        return puljeB;
    }

    public void setPuljeB(PuljeB puljeB)
    {
        this.puljeB = puljeB;
    }

    @XmlTransient
    public Collection<FørsteRunde> getFørsteRundeCollection()
    {
        return førsteRundeCollection;
    }

    public void setFørsteRundeCollection(Collection<FørsteRunde> førsteRundeCollection)
    {
        this.førsteRundeCollection = førsteRundeCollection;
    }

    @XmlTransient
    public Collection<FørsteRunde> getFørsteRundeCollection1()
    {
        return førsteRundeCollection1;
    }

    public void setFørsteRundeCollection1(Collection<FørsteRunde> førsteRundeCollection1)
    {
        this.førsteRundeCollection1 = førsteRundeCollection1;
    }

    @XmlTransient
    public Collection<FørsteRunde> getFørsteRundeCollection2()
    {
        return førsteRundeCollection2;
    }

    public void setFørsteRundeCollection2(Collection<FørsteRunde> førsteRundeCollection2)
    {
        this.førsteRundeCollection2 = førsteRundeCollection2;
    }

    @XmlTransient
    public Collection<FørsteRunde> getFørsteRundeCollection3()
    {
        return førsteRundeCollection3;
    }

    public void setFørsteRundeCollection3(Collection<FørsteRunde> førsteRundeCollection3)
    {
        this.førsteRundeCollection3 = førsteRundeCollection3;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valgfag))
        {
            return false;
        }
        Valgfag other = (Valgfag) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "entity.Valgfag[ id=" + id + " ]";
    }
    
}
