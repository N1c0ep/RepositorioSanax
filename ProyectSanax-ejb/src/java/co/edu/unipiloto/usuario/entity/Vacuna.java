/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge_j3qr4sd
 */
@Entity
@Table(name = "VACUNA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vacuna.findAll", query = "SELECT v FROM Vacuna v")
    , @NamedQuery(name = "Vacuna.findByDistribuidor", query = "SELECT v FROM Vacuna v WHERE v.distribuidor = :distribuidor")
    , @NamedQuery(name = "Vacuna.findByVencimiento", query = "SELECT v FROM Vacuna v WHERE v.vencimiento = :vencimiento")
    , @NamedQuery(name = "Vacuna.findByIdVacuna", query = "SELECT v FROM Vacuna v WHERE v.idVacuna = :idVacuna")})
public class Vacuna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "DISTRIBUIDOR")
    private String distribuidor;
    @Column(name = "VENCIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date vencimiento;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_VACUNA")
    private Integer idVacuna;
    @JoinColumn(name = "ID_INVENTARIOVACUNA", referencedColumnName = "ID_INVENTARIO")
    @ManyToOne
    private InventarioVacunas idInventariovacuna;

    public Vacuna() {
    }

    public Vacuna(Integer idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Integer getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Integer idVacuna) {
        this.idVacuna = idVacuna;
    }

    public InventarioVacunas getIdInventariovacuna() {
        return idInventariovacuna;
    }

    public void setIdInventariovacuna(InventarioVacunas idInventariovacuna) {
        this.idInventariovacuna = idInventariovacuna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVacuna != null ? idVacuna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacuna)) {
            return false;
        }
        Vacuna other = (Vacuna) object;
        if ((this.idVacuna == null && other.idVacuna != null) || (this.idVacuna != null && !this.idVacuna.equals(other.idVacuna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.Vacuna[ idVacuna=" + idVacuna + " ]";
    }
    
}
