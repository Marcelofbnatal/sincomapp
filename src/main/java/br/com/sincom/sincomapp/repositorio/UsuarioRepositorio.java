/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sincom.sincomapp.repositorio;

import br.com.sincom.sincomapp.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joaon
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    
}
