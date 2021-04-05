/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.Cita;
import co.edu.unipiloto.usuario.entity.CitaPK;
import co.edu.unipiloto.usuario.entity.Usuariosnuevos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jorge_j3qr4sd
 */
@Stateless
public class CitaFacade extends AbstractFacade<Cita> implements CitaFacadeLocal {

    @PersistenceContext(unitName = "UsuarioPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CitaFacade() {
        super(Cita.class);
    }

    @Override
    public Cita consultarCita(CitaPK pk) {
        return em.find(Cita.class,pk);
    }

    @Override
    public void insertarCita(int id,int fase,String horaStr,String fechaStr,int iduser) {
        CitaPK pk = new CitaPK(id,iduser);
        if (consultarCita(pk)!= null) {
            
        } else {
            Cita ec = new Cita(id,fase,horaStr,fechaStr,iduser);
            ec.setCitaPK(pk);
            em.persist(ec);
            
        }
    }
}
