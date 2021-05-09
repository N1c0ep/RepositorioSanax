/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.PersonalVacunacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface PersonalVacunacionFacadeLocal {

    void create(PersonalVacunacion personalVacunacion);

    void edit(PersonalVacunacion personalVacunacion);

    void remove(PersonalVacunacion personalVacunacion);

    PersonalVacunacion find(Object id);

    List<PersonalVacunacion> findAll();

    List<PersonalVacunacion> findRange(int[] range);

    int count();
    
}
