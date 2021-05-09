/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.InventarioNacional;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface InventarioNacionalFacadeLocal {

    void create(InventarioNacional inventarioNacional);

    void edit(InventarioNacional inventarioNacional);

    void remove(InventarioNacional inventarioNacional);

    InventarioNacional find(Object id);

    List<InventarioNacional> findAll();

    List<InventarioNacional> findRange(int[] range);

    int count();
    
}
