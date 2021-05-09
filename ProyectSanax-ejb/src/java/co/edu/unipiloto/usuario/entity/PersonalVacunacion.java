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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PERSONAL_VACUNACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonalVacunacion.findAll", query = "SELECT p FROM PersonalVacunacion p")
    , @NamedQuery(name = "PersonalVacunacion.findByIdPersonal", query = "SELECT p FROM PersonalVacunacion p WHERE p.idPersonal = :idPersonal")
    , @NamedQuery(name = "PersonalVacunacion.findByNombre", query = "SELECT p FROM PersonalVacunacion p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "PersonalVacunacion.findByApellido", query = "SELECT p FROM PersonalVacunacion p WHERE p.apellido = :apellido")
    , @NamedQuery(name = "PersonalVacunacion.findByCorreo", query = "SELECT p FROM PersonalVacunacion p WHERE p.correo = :correo")
    , @NamedQuery(name = "PersonalVacunacion.findByTelefono", query = "SELECT p FROM PersonalVacunacion p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "PersonalVacunacion.findByFecha", query = "SELECT p FROM PersonalVacunacion p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "PersonalVacunacion.findByContrasena", query = "SELECT p FROM PersonalVacunacion p WHERE p.contrasena = :contrasena")})
public class PersonalVacunacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PERSONAL")
    private Integer idPersonal;
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
    @OneToMany(mappedBy = "idPersonalvac")
    private Collection<ReporteVacunacion> reporteVacunacionCollection;
    @JoinColumn(name = "ID_SITIO", referencedColumnName = "ID_SITIO")
    @ManyToOne(optional = false)
    private Sitio idSitio;

    public PersonalVacunacion() {
    }

    public PersonalVacunacion(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public PersonalVacunacion(Integer idPersonal, String nombre, String apellido, String correo, String telefono, Date fecha, String contrasena) {
        this.idPersonal = idPersonal;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha = fecha;
        this.contrasena = contrasena;
    }

    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
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
    public Collection<ReporteVacunacion> getReporteVacunacionCollection() {
        return reporteVacunacionCollection;
    }

    public void setReporteVacunacionCollection(Collection<ReporteVacunacion> reporteVacunacionCollection) {
        this.reporteVacunacionCollection = reporteVacunacionCollection;
    }

    public Sitio getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(Sitio idSitio) {
        this.idSitio = idSitio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonal != null ? idPersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonalVacunacion)) {
            return false;
        }
        PersonalVacunacion other = (PersonalVacunacion) object;
        if ((this.idPersonal == null && other.idPersonal != null) || (this.idPersonal != null && !this.idPersonal.equals(other.idPersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.PersonalVacunacion[ idPersonal=" + idPersonal + " ]";
    }
    
}
