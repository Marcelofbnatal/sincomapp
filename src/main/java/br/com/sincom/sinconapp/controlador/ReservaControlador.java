/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sincom.sinconapp.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sincom.sinconapp.repositorio.ReservaRepositorio;

/**
 *
 * @author Marcelo Fernandes
 */
@Controller
@RequestMapping(path = "reservas")
public class ReservaControlador {
    @Autowired
    private ReservaRepositorio reservaRepositorio;
    
    @RequestMapping("/cadastrarReservas")
	public String form(){
		return "/reservas";
   // @GetMapping
   // public ModelAndView home(){
     //   ModelAndView modelAndView = new ModelAndView("reservas");
     //   modelAndView.addObject("reservas", reservaRepositorio.findAll());
     //   return modelAndView;
    }
}
        
