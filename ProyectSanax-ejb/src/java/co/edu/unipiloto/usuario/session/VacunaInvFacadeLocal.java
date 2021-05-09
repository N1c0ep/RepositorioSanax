/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.VacunaInv;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface VacunaInvFacadeLocal {

    void create(VacunaInv vacunaInv);

    void edit(VacunaInv vacunaInv);

    void remove(VacunaInv vacunaInv);

    VacunaInv find(Object id);

    List<VacunaInv> findAll();

    List<VacunaInv> findRange(int[] range);

    int count();
    
}
