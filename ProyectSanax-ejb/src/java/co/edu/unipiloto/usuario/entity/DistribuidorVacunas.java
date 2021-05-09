/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jorge_j3qr4sd
 */
@Entity
@Table(name = "DISTRIBUIDOR_VACUNAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DistribuidorVacunas.findAll", query = "SELECT d FROM DistribuidorVacunas d")
    , @NamedQuery(name = "DistribuidorVacunas.findByIdDistribuidor", query = "SELECT d FROM DistribuidorVacunas d WHERE d.idDistribuidor = :idDistribuidor")
    , @NamedQuery(name = "DistribuidorVacunas.findByNombre", query = "SELECT d FROM DistribuidorVacunas d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "DistribuidorVacunas.findByApellido", query = "SELECT d FROM DistribuidorVacunas d WHERE d.apellido = :apellido")
    , @NamedQuery(name = "DistribuidorVacunas.findByCorreo", query = "SELECT d FROM DistribuidorVacunas d WHERE d.correo = :correo")
    , @NamedQuery(name = "DistribuidorVacunas.findByTelefono", query = "SELECT d FROM DistribuidorVacunas d WHERE d.telefono = :telefono")
    , @NamedQuery(name = "DistribuidorVacunas.findByFecha", query = "SELECT d FROM DistribuidorVacunas d WHERE d.fecha = :fecha")
    , @NamedQuery(name = "DistribuidorVacunas.findByContrasena", query = "SELECT d FROM DistribuidorVacunas d WHERE d.contrasena = :contrasena")})
public class DistribuidorVacunas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_DISTRIBUIDOR")
    private Integer idDistribuidor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "APELLIDO")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CORREO")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TELEFONO")
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CONTRASENA")
    private String contrasena;
    @OneToMany(mappedBy = "idDistribuidor")
    private Collection<InventarioNacional> inventarioNacionalCollection;

    public DistribuidorVacunas() {
    }

    public DistribuidorVacunas(Integer idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public DistribuidorVacunas(Integer idDistribuidor, String nombre, String apellido, String correo, String telefono, Date fecha, String contrasena) {
        this.idDistribuidor = idDistribuidor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha = fecha;
        this.contrasena = contrasena;
    }

    public Integer getIdDistribuidor() {
        return idDistribuidor;
    }

    public void setIdDistribuidor(Integer idDistribuidor) {
        this.idDistribuidor = idDistribuidor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @XmlTransient
    public Collection<InventarioNacional> getInventarioNacionalCollection() {
        return inventarioNacionalCollection;
    }

    public void setInventarioNacionalCollection(Collection<InventarioNacional> inventarioNacionalCollection) {
        this.inventarioNacionalCollection = inventarioNacionalCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDistribuidor != null ? idDistribuidor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DistribuidorVacunas)) {
            return false;
        }
        DistribuidorVacunas other = (DistribuidorVacunas) object;
        if ((this.idDistribuidor == null && other.idDistribuidor != null) || (this.idDistribuidor != null && !this.idDistribuidor.equals(other.idDistribuidor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.DistribuidorVacunas[ idDistribuidor=" + idDistribuidor + " ]";
    }
    
}
