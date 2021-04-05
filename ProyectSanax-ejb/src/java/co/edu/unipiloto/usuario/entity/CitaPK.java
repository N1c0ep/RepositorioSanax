/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jorge_j3qr4sd
 */
@Embeddable
public class CitaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "IDCITA")
    private int idcita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_USER")
    private int idUser;

    public CitaPK() {
    }

    public CitaPK(int idcita, int idUser) {
        this.idcita = idcita;
        this.idUser = idUser;
    }

    public int getIdcita() {
        return idcita;
    }

    public void setIdcita(int idcita) {
        this.idcita = idcita;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idcita;
        hash += (int) idUser;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CitaPK)) {
            return false;
        }
        CitaPK other = (CitaPK) object;
        if (this.idcita != other.idcita) {
            return false;
        }
        if (this.idUser != other.idUser) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.unipiloto.usuario.entity.CitaPK[ idcita=" + idcita + ", idUser=" + idUser + " ]";
    }
    
}
