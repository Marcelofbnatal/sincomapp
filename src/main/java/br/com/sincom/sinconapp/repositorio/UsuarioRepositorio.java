/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sincom.sinconapp.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sincom.sinconapp.modelo.Usuario;

/**
 *
 * @author Marcelo Fernandes
 */
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{
    
}
