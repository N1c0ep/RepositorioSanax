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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge_j3qr4sd
 */
@Entity
@Table(name = "REPORTE_VACUNACION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReporteVacunacion.findAll", query = "SELECT r FROM ReporteVacunacion r")
    , @NamedQuery(name = "ReporteVacunacion.findByIdReporte", query = "SELECT r FROM ReporteVacunacion r WHERE r.idReporte = :idReporte")
    , @NamedQuery(name = "ReporteVacunacion.findByBrazo", query = "SELECT r FROM ReporteVacunacion r WHERE r.brazo = :brazo")})
public class ReporteVacunacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_REPORTE")
    private Integer idReporte;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "BRAZO")
    private String brazo;
    @JoinColumn(name = "ID_CITA", referencedColumnName = "ID_CITA")
    @ManyToOne
    private Cita idCita;
    @JoinColumn(name = "ID_PERSONALVAC", referencedColumnName = "ID_PERSONAL")
    @ManyToOne
    private PersonalVacunacion idPersonalvac;

    public ReporteVacunacion() {
    }

    public ReporteVacunacion(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public ReporteVacunacion(Integer idReporte, String brazo) {
        this.idReporte = idReporte;
        this.brazo = brazo;
    }
    
    public ReporteVacunacion(Integer idReporte, String brazo, PersonalVacunacion idPersonalvac, Cita idCita ) {
        this.idReporte = idReporte;
        this.brazo = brazo;
        this.idPersonalvac=idPersonalvac;
        this.idCita=idCita;
    }

    public Integer getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(Integer idReporte) {
        this.idReporte = idReporte;
    }

    public String getBrazo() {
        return brazo;
    }

    public void setBrazo(String brazo) {
        this.brazo = brazo;
    }

    public Cita getIdCita() {
        return idCita;
    }

    public void setIdCita(Cita idCita) {
        this.idCita = idCita;
    }

    public PersonalVacunacion getIdPersonalvac() {
        return idPersonalvac;
    }

    public void setIdPersonalvac(PersonalVacunacion idPersonalvac) {
        this.idPersonalvac = idPersonalvac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReporte != null ? idReporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReporteVacunacion)) {
            return false;
        }
        ReporteVacunacion other = (ReporteVacunacion) object;
        if ((this.idReporte == null && other.idReporte != null) || (this.idReporte != null && !this.idReporte.equals(other.idReporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.ReporteVacunacion[ idReporte=" + idReporte + " ]";
    }
    
}
