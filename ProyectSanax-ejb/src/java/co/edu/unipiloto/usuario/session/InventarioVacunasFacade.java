/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.InventarioVacunas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jorge_j3qr4sd
 */
@Stateless
public class InventarioVacunasFacade extends AbstractFacade<InventarioVacunas> implements InventarioVacunasFacadeLocal {

    @PersistenceContext(unitName = "UsuarioPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InventarioVacunasFacade() {
        super(InventarioVacunas.class);
    }
    
}
