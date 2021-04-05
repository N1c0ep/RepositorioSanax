/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    , @NamedQuery(name = "Cita.findByIdcita", query = "SELECT c FROM Cita c WHERE c.citaPK.idcita = :idcita")
    , @NamedQuery(name = "Cita.findByFase", query = "SELECT c FROM Cita c WHERE c.fase = :fase")
    , @NamedQuery(name = "Cita.findByHora", query = "SELECT c FROM Cita c WHERE c.hora = :hora")
    , @NamedQuery(name = "Cita.findByFecha", query = "SELECT c FROM Cita c WHERE c.fecha = :fecha")
    , @NamedQuery(name = "Cita.findByIdUser", query = "SELECT c FROM Cita c WHERE c.citaPK.idUser = :idUser")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CitaPK citaPK;
    @Column(name = "FASE")
    private Integer fase;
//    @Column(name = "IDCITA")
//    private Integer idcita;
    @Size(max = 50)
    @Column(name = "HORA")
    private String hora;
    @Size(max = 50)
    @Column(name = "FECHA")
    private String fecha;
    @JoinColumn(name = "ID_USER", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuariosnuevos usuariosnuevos;

    public Cita() {
    }

    public Cita(CitaPK citaPK) {
        this.citaPK = citaPK;
    }

    public Cita(Integer idcita,Integer fase, String hora, String fecha, Integer iduser) {
        this.fase = fase;
        this.hora = hora;
        this.fecha = fecha;
//        this.idcita= idcita;
        this.usuariosnuevos=new Usuariosnuevos(iduser);
    }

//    public Integer getIdcita() {
//        return idcita;
//    }
//
//    public void setIdcita(Integer idcita) {
//        this.idcita = idcita;
//    }

    public Cita(int idcita, int idUser) {
        this.citaPK = new CitaPK(idcita, idUser);
    }

    public CitaPK getCitaPK() {
        return citaPK;
    }

    public void setCitaPK(CitaPK citaPK) {
        this.citaPK = citaPK;
    }

    public Integer getFase() {
        return fase;
    }

    public void setFase(Integer fase) {
        this.fase = fase;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuariosnuevos getUsuariosnuevos() {
        return usuariosnuevos;
    }

    public void setUsuariosnuevos(Usuariosnuevos usuariosnuevos) {
        this.usuariosnuevos = usuariosnuevos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (citaPK != null ? citaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.citaPK == null && other.citaPK != null) || (this.citaPK != null && !this.citaPK.equals(other.citaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.Cita[ citaPK=" + citaPK + " ]";
    }
    
}
