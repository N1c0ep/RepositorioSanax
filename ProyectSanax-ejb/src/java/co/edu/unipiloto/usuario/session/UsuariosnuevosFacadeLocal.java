/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.usuario.session;

import co.edu.unipiloto.usuario.entity.Usuariosnuevos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jorge_j3qr4sd
 */
@Local
public interface UsuariosnuevosFacadeLocal {

    void create(Usuariosnuevos usuariosnuevos);

    void edit(Usuariosnuevos usuariosnuevos);

    void remove(Usuariosnuevos usuariosnuevos);

    Usuariosnuevos find(Object id);

    List<Usuariosnuevos> findAll();

    List<Usuariosnuevos> findRange(int[] range);

    int count();
    
}
