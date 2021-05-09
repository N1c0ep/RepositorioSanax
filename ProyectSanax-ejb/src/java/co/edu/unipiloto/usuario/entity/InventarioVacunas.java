/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jorge_j3qr4sd
 */
@Entity
@Table(name = "INVENTARIO_VACUNAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InventarioVacunas.findAll", query = "SELECT i FROM InventarioVacunas i")
    , @NamedQuery(name = "InventarioVacunas.findByIdInventario", query = "SELECT i FROM InventarioVacunas i WHERE i.idInventario = :idInventario")})
public class InventarioVacunas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INVENTARIO")
    private Integer idInventario;
    @JoinColumn(name = "ID_INVENTARIONAC", referencedColumnName = "ID_INVENTARIONAC")
    @ManyToOne
    private InventarioNacional idInventarionac;
    @JoinColumn(name = "ID_SITIO", referencedColumnName = "ID_SITIO")
    @ManyToOne
    private Sitio idSitio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idInventario")
    private Collection<VacunaInv> vacunaInvCollection;

    public InventarioVacunas() {
    }

    public InventarioVacunas(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public InventarioNacional getIdInventarionac() {
        return idInventarionac;
    }

    public void setIdInventarionac(InventarioNacional idInventarionac) {
        this.idInventarionac = idInventarionac;
    }

    public Sitio getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(Sitio idSitio) {
        this.idSitio = idSitio;
    }

    @XmlTransient
    public Collection<VacunaInv> getVacunaInvCollection() {
        return vacunaInvCollection;
    }

    public void setVacunaInvCollection(Collection<VacunaInv> vacunaInvCollection) {
        this.vacunaInvCollection = vacunaInvCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInventario != null ? idInventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventarioVacunas)) {
            return false;
        }
        InventarioVacunas other = (InventarioVacunas) object;
        if ((this.idInventario == null && other.idInventario != null) || (this.idInventario != null && !this.idInventario.equals(other.idInventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.InventarioVacunas[ idInventario=" + idInventario + " ]";
    }
    
}
