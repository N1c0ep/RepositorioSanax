/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge_j3qr4sd
 */
@Entity
@Table(name = "CITA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c")
    , @NamedQuery(name = "Cita.findByIdCita", query = "SELECT c FROM Cita c WHERE c.idCita = :idCita")
    , @NamedQuery(name = "Cita.findByFecha", query = "SELECT c FROM Cita c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cita.findByHora", query = "SELECT c FROM Cita c WHERE c.hora = :hora")
    , @NamedQuery(name = "Cita.findByFase", query = "SELECT c FROM Cita c WHERE c.fase = :fase")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_CITA")
    private Integer idCita;
    @Size(max = 50)
    @Column(name = "FECHA")
    private String fecha;
    @Size(max = 50)
    @Column(name = "HORA")
    private String hora;
    @Size(max = 50)
    @Column(name = "FASE")
    private String fase;
    @JoinColumn(name = "ID_SITIO", referencedColumnName = "ID_SITIO")
    @ManyToOne
    private Sitio idSitio;
    @JoinColumn(name = "IDENTIFICACION", referencedColumnName = "ID")
    @ManyToOne
    private Usuariosnuevos identificacion;

    public Cita() {
    }

    public Cita(Integer idCita) {
        this.idCita = idCita;
    }

    public Cita(Integer iduser, String fecha, String hora, String fase, Integer idsitio) {
        this.fecha = fecha;
        this.hora = hora;
        this.fase = fase;
        this.identificacion= new Usuariosnuevos(iduser);
        this.idSitio=new Sitio(idsitio);
    }
    
    public Cita(Integer idCita, Usuariosnuevos identificacion) {
        this.idCita = idCita;
        this.identificacion = identificacion;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public Sitio getIdSitio() {
        return idSitio;
    }

    public void setIdSitio(Sitio idSitio) {
        this.idSitio = idSitio;
    }

    public Usuariosnuevos getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Usuariosnuevos identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCita != null ? idCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idCita == null && other.idCita != null) || (this.idCita != null && !this.idCita.equals(other.idCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.Cita[ idCita=" + idCita + " ]";
    }
    
}
