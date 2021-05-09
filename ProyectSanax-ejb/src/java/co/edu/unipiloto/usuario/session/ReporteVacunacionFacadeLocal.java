/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.ReporteVacunacion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface ReporteVacunacionFacadeLocal {

    void create(ReporteVacunacion reporteVacunacion);

    void edit(ReporteVacunacion reporteVacunacion);

    void remove(ReporteVacunacion reporteVacunacion);

    ReporteVacunacion find(Object id);

    List<ReporteVacunacion> findAll();

    List<ReporteVacunacion> findRange(int[] range);

    int count();
    
}
