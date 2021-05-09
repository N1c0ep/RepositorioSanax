/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.DistribuidorVacunas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface DistribuidorVacunasFacadeLocal {

    void create(DistribuidorVacunas distribuidorVacunas);

    void edit(DistribuidorVacunas distribuidorVacunas);

    void remove(DistribuidorVacunas distribuidorVacunas);

    DistribuidorVacunas find(Object id);

    List<DistribuidorVacunas> findAll();

    List<DistribuidorVacunas> findRange(int[] range);

    int count();
    
}
