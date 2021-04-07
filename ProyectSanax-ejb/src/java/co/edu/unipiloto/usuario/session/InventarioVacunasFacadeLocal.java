/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.InventarioVacunas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface InventarioVacunasFacadeLocal {

    void create(InventarioVacunas inventarioVacunas);

    void edit(InventarioVacunas inventarioVacunas);

    void remove(InventarioVacunas inventarioVacunas);

    InventarioVacunas find(Object id);

    List<InventarioVacunas> findAll();

    List<InventarioVacunas> findRange(int[] range);

    int count();
    
}
