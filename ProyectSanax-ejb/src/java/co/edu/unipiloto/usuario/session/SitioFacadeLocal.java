/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.Sitio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface SitioFacadeLocal {

    void create(Sitio sitio);

    void edit(Sitio sitio);

    void remove(Sitio sitio);

    Sitio find(Object id);

    List<Sitio> findAll();

    List<Sitio> findRange(int[] range);

    int count();
    
}
