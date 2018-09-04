/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sincom.sinconapp.repositorio;

import br.com.sincom.sinconapp.modelo.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 *
 * @author Marcelo Fernandes
 */
@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva, Long>{
    
}
