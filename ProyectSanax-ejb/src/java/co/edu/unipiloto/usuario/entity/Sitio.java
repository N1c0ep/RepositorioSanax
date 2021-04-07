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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jorge_j3qr4sd
 */
@Entity
@Table(name = "SITIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sitio.findAll", query = "SELECT s FROM Sitio s")
    , @NamedQuery(name = "Sitio.findByIdSitio", query = "SELECT s FROM Sitio s WHERE s.idSitio = :idSitio")
    , @NamedQuery(name = "Sitio.findBySitio", query = "SELECT s FROM Sitio s WHERE s.sitio = :sitio")
    , @NamedQuery(name = "Sitio.findByDireccion", query = "SELECT s FROM Sitio s WHERE s.direccion = :direccion")})
public class Sitio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SITIO")
    private Integer idSitio;
    @Size(max = 50)
    @Column(name = "SITIO")
    private String sitio;
    @Size(max = 50)
    @Column(name = "DIRECCION")
    private String direccion;
    @JoinColumn(name = "ID_ADMINISTRADOR", referencedColumnName = "ID_ADMINISTRADOR")
    @ManyToOne
    private Administrador idAdministrador;
    @OneToMany(mappedBy = "idSitio")
    private Collection<InventarioVacunas> inventarioVacunasCollection;
    @OneToMany(mappedBy = "idSitio")
    private Collection<Cita> citaCollection;

    public Sitio() {
    }

    public Sitio(Integer idSitio) {
        this.idSitio = idSitio;
    }

    public Integer getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(Integer idSitio) {
        this.idSitio = idSitio;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Administrador getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Administrador idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    @XmlTransient
    public Collection<InventarioVacunas> getInventarioVacunasCollection() {
        return inventarioVacunasCollection;
    }

    public void setInventarioVacunasCollection(Collection<InventarioVacunas> inventarioVacunasCollection) {
        this.inventarioVacunasCollection = inventarioVacunasCollection;
    }

    @XmlTransient
    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSitio != null ? idSitio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sitio)) {
            return false;
        }
        Sitio other = (Sitio) object;
        if ((this.idSitio == null && other.idSitio != null) || (this.idSitio != null && !this.idSitio.equals(other.idSitio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.Sitio[ idSitio=" + idSitio + " ]";
    }
    
}
