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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "VACUNA_INV")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VacunaInv.findAll", query = "SELECT v FROM VacunaInv v")
    , @NamedQuery(name = "VacunaInv.findByIdVacuna", query = "SELECT v FROM VacunaInv v WHERE v.idVacuna = :idVacuna")
    , @NamedQuery(name = "VacunaInv.findByDistribuidor", query = "SELECT v FROM VacunaInv v WHERE v.distribuidor = :distribuidor")
    , @NamedQuery(name = "VacunaInv.findByLote", query = "SELECT v FROM VacunaInv v WHERE v.lote = :lote")
    , @NamedQuery(name = "VacunaInv.findByVencimiento", query = "SELECT v FROM VacunaInv v WHERE v.vencimiento = :vencimiento")
    , @NamedQuery(name = "VacunaInv.findByCantidad", query = "SELECT v FROM VacunaInv v WHERE v.cantidad = :cantidad")})
public class VacunaInv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VACUNA")
    private Integer idVacuna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DISTRIBUIDOR")
    private String distribuidor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LOTE")
    private int lote;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VENCIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date vencimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private int cantidad;
    @JoinColumn(name = "ID_INVENTARIO", referencedColumnName = "ID_INVENTARIO")
    @ManyToOne(optional = false)
    private InventarioVacunas idInventario;

    public VacunaInv() {
    }

    public VacunaInv(Integer idVacuna) {
        this.idVacuna = idVacuna;
    }

    public VacunaInv(Integer idVacuna, String distribuidor, int lote, Date vencimiento, int cantidad) {
        this.idVacuna = idVacuna;
        this.distribuidor = distribuidor;
        this.lote = lote;
        this.vencimiento = vencimiento;
        this.cantidad = cantidad;
    }

    public Integer getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Integer idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public InventarioVacunas getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(InventarioVacunas idInventario) {
        this.idInventario = idInventario;
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
        if (!(object instanceof VacunaInv)) {
            return false;
        }
        VacunaInv other = (VacunaInv) object;
        if ((this.idVacuna == null && other.idVacuna != null) || (this.idVacuna != null && !this.idVacuna.equals(other.idVacuna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.VacunaInv[ idVacuna=" + idVacuna + " ]";
    }
    
}
