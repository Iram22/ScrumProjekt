/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bruger
 */
@Entity
@Table(name = "F\u00d8RSTE_RUNDE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "F\u00f8rsteRunde.findAll", query = "SELECT f FROM F\u00f8rsteRunde f"),
    @NamedQuery(name = "F\u00f8rsteRunde.findById", query = "SELECT f FROM F\u00f8rsteRunde f WHERE f.id = :id")})
public class FørsteRunde implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @JoinColumn(name = "F\u00d8RSTE_PRIORITET", referencedColumnName = "ID")
    @ManyToOne
    private Valgfag førstePrioritet;
    @JoinColumn(name = "ANDEN_PRIORITET", referencedColumnName = "ID")
    @ManyToOne
    private Valgfag andenPrioritet;
    @JoinColumn(name = "STUDENTID", referencedColumnName = "ID")
    @ManyToOne
    private Student studentid;

    public FørsteRunde() {
    }

    public FørsteRunde(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Valgfag getFørstePrioritet() {
        return førstePrioritet;
    }

    public void setFørstePrioritet(Valgfag førstePrioritet) {
        this.førstePrioritet = førstePrioritet;
    }

    public Valgfag getAndenPrioritet() {
        return andenPrioritet;
    }

    public void setAndenPrioritet(Valgfag andenPrioritet) {
        this.andenPrioritet = andenPrioritet;
    }

    public Student getStudentid() {
        return studentid;
    }

    public void setStudentid(Student studentid) {
        this.studentid = studentid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FørsteRunde)) {
            return false;
        }
        FørsteRunde other = (FørsteRunde) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.F\u00f8rsteRunde[ id=" + id + " ]";
    }
    
}
