/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "INVENTARIO_NACIONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InventarioNacional.findAll", query = "SELECT i FROM InventarioNacional i")
    , @NamedQuery(name = "InventarioNacional.findByIdInventarionac", query = "SELECT i FROM InventarioNacional i WHERE i.idInventarionac = :idInventarionac")})
public class InventarioNacional implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_INVENTARIONAC")
    private Integer idInventarionac;
    @OneToMany(mappedBy = "idInventarionac")
    private Collection<InventarioVacunas> inventarioVacunasCollection;
    @OneToMany(mappedBy = "idInventarionac")
    private Collection<VacunaInvnac> vacunaInvnacCollection;
    @OneToMany(mappedBy = "idInvnac")
    private Collection<DistribuidorVacunas> distribuidorVacunasCollection;

    public InventarioNacional() {
    }

    public InventarioNacional(Integer idInventarionac) {
        this.idInventarionac = idInventarionac;
    }

    public Integer getIdInventarionac() {
        return idInventarionac;
    }

    public void setIdInventarionac(Integer idInventarionac) {
        this.idInventarionac = idInventarionac;
    }

    @XmlTransient
    public Collection<InventarioVacunas> getInventarioVacunasCollection() {
        return inventarioVacunasCollection;
    }

    public void setInventarioVacunasCollection(Collection<InventarioVacunas> inventarioVacunasCollection) {
        this.inventarioVacunasCollection = inventarioVacunasCollection;
    }

    @XmlTransient
    public Collection<VacunaInvnac> getVacunaInvnacCollection() {
        return vacunaInvnacCollection;
    }

    public void setVacunaInvnacCollection(Collection<VacunaInvnac> vacunaInvnacCollection) {
        this.vacunaInvnacCollection = vacunaInvnacCollection;
    }

    @XmlTransient
    public Collection<DistribuidorVacunas> getDistribuidorVacunasCollection() {
        return distribuidorVacunasCollection;
    }

    public void setDistribuidorVacunasCollection(Collection<DistribuidorVacunas> distribuidorVacunasCollection) {
        this.distribuidorVacunasCollection = distribuidorVacunasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInventarionac != null ? idInventarionac.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventarioNacional)) {
            return false;
        }
        InventarioNacional other = (InventarioNacional) object;
        if ((this.idInventarionac == null && other.idInventarionac != null) || (this.idInventarionac != null && !this.idInventarionac.equals(other.idInventarionac))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.InventarioNacional[ idInventarionac=" + idInventarionac + " ]";
    }
    
}
