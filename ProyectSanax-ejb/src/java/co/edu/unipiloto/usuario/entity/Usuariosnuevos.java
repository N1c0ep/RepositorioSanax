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
@Table(name = "USUARIOSNUEVOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuariosnuevos.findAll", query = "SELECT u FROM Usuariosnuevos u")
    , @NamedQuery(name = "Usuariosnuevos.findById", query = "SELECT u FROM Usuariosnuevos u WHERE u.id = :id")
    , @NamedQuery(name = "Usuariosnuevos.findByNombre", query = "SELECT u FROM Usuariosnuevos u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuariosnuevos.findByApellido", query = "SELECT u FROM Usuariosnuevos u WHERE u.apellido = :apellido")
    , @NamedQuery(name = "Usuariosnuevos.findByCorreo", query = "SELECT u FROM Usuariosnuevos u WHERE u.correo = :correo")
    , @NamedQuery(name = "Usuariosnuevos.findByFecha", query = "SELECT u FROM Usuariosnuevos u WHERE u.fecha = :fecha")
    , @NamedQuery(name = "Usuariosnuevos.findByLocalidad", query = "SELECT u FROM Usuariosnuevos u WHERE u.localidad = :localidad")
    , @NamedQuery(name = "Usuariosnuevos.findByContrasena", query = "SELECT u FROM Usuariosnuevos u WHERE u.contrasena = :contrasena")
    , @NamedQuery(name = "Usuariosnuevos.findByTipoDocumento", query = "SELECT u FROM Usuariosnuevos u WHERE u.tipoDocumento = :tipoDocumento")
    , @NamedQuery(name = "Usuariosnuevos.findByDireccion", query = "SELECT u FROM Usuariosnuevos u WHERE u.direccion = :direccion")
    , @NamedQuery(name = "Usuariosnuevos.findByTelefono", query = "SELECT u FROM Usuariosnuevos u WHERE u.telefono = :telefono")})
public class Usuariosnuevos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 50)
    @Column(name = "APELLIDO")
    private String apellido;
    @Size(max = 50)
    @Column(name = "CORREO")
    private String correo;
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 50)
    @Column(name = "LOCALIDAD")
    private String localidad;
    @Size(max = 50)
    @Column(name = "CONTRASENA")
    private String contrasena;
    @Size(max = 50)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Size(max = 50)
    @Column(name = "DIRECCION")
    private String direccion;
    @Size(max = 50)
    @Column(name = "TELEFONO")
    private String telefono;
    @OneToMany(mappedBy = "identificacion")
    private Collection<Cita> citaCollection;

    public Usuariosnuevos() {
    }

    public Usuariosnuevos(Integer id) {
        this.id = id;
    }
    
    public Usuariosnuevos(Integer id, String nombre, String apellido, String correo, Date fecha, String localidad, String contrasena, String tipoDocumento, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fecha = fecha;
        this.localidad = localidad;
        this.contrasena = contrasena;
        this.tipoDocumento = tipoDocumento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuariosnuevos)) {
            return false;
        }
        Usuariosnuevos other = (Usuariosnuevos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.Usuariosnuevos[ id=" + id + " ]";
    }
    
}
