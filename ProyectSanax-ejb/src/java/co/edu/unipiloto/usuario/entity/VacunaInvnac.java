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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jorge_j3qr4sd
 */
@Entity
@Table(name = "VACUNA_INVNAC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VacunaInvnac.findAll", query = "SELECT v FROM VacunaInvnac v")
    , @NamedQuery(name = "VacunaInvnac.findByIdVacuna", query = "SELECT v FROM VacunaInvnac v WHERE v.idVacuna = :idVacuna")
    , @NamedQuery(name = "VacunaInvnac.findByMarca", query = "SELECT v FROM VacunaInvnac v WHERE v.marca = :marca")
    , @NamedQuery(name = "VacunaInvnac.findByCantidad", query = "SELECT v FROM VacunaInvnac v WHERE v.cantidad = :cantidad")
    , @NamedQuery(name = "VacunaInvnac.findByLote", query = "SELECT v FROM VacunaInvnac v WHERE v.lote = :lote")
    , @NamedQuery(name = "VacunaInvnac.findByVencimiento", query = "SELECT v FROM VacunaInvnac v WHERE v.vencimiento = :vencimiento")})
public class VacunaInvnac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID_VACUNA")
    private Integer idVacuna;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "MARCA")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CANTIDAD")
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "LOTE")
    private String lote;
    @Size(max = 50)
    @Column(name = "VENCIMIENTO")
    private String vencimiento;
    @JoinColumn(name = "ID_INVENTARIONAC", referencedColumnName = "ID_INVENTARIONAC")
    @ManyToOne
    private InventarioNacional idInventarionac;

    public VacunaInvnac() {
    }

    public VacunaInvnac(Integer idVacuna) {
        this.idVacuna = idVacuna;
    }

    public VacunaInvnac( String marca, int cantidad, String lote, String vencimiento,InventarioNacional idInventarionac) {
        this.marca = marca;
        this.cantidad = cantidad;
        this.lote = lote;
        this.vencimiento=vencimiento;
        this.idInventarionac=idInventarionac;
    }

    public Integer getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(Integer idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public InventarioNacional getIdInventarionac() {
        return idInventarionac;
    }

    public void setIdInventarionac(InventarioNacional idInventarionac) {
        this.idInventarionac = idInventarionac;
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
        if (!(object instanceof VacunaInvnac)) {
            return false;
        }
        VacunaInvnac other = (VacunaInvnac) object;
        if ((this.idVacuna == null && other.idVacuna != null) || (this.idVacuna != null && !this.idVacuna.equals(other.idVacuna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.VacunaInvnac[ idVacuna=" + idVacuna + " ]";
    }
    
}
