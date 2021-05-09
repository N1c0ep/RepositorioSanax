/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.VacunaInvnac;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface VacunaInvnacFacadeLocal {

    void create(VacunaInvnac vacunaInvnac);

    void edit(VacunaInvnac vacunaInvnac);

    void remove(VacunaInvnac vacunaInvnac);

    VacunaInvnac find(Object id);

    List<VacunaInvnac> findAll();

    List<VacunaInvnac> findRange(int[] range);

    int count();
    
}
