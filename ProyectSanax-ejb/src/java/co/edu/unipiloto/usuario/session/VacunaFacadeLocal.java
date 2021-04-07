/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.Vacuna;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface VacunaFacadeLocal {

    void create(Vacuna vacuna);

    void edit(Vacuna vacuna);

    void remove(Vacuna vacuna);

    Vacuna find(Object id);

    List<Vacuna> findAll();

    List<Vacuna> findRange(int[] range);

    int count();
    
}
