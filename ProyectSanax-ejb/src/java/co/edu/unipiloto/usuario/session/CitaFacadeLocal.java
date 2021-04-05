/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.Cita;
import co.edu.unipiloto.usuario.entity.CitaPK;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface CitaFacadeLocal {

    void create(Cita cita);

    void edit(Cita cita);

    void remove(Cita cita);

    Cita find(Object id);

    List<Cita> findAll();

    List<Cita> findRange(int[] range);

    int count();
    
    Cita consultarCita(CitaPK pk);

    public void insertarCita(int id, int fase, String horaStr, String fechaStr, int userid);
   
}
