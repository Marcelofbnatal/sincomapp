/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sincom.sincomapp.controlador;

import br.com.sincom.sincomapp.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author joaon
 */
@Controller
@RequestMapping(path = "usuarios")
public class UsuarioControlador {
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @GetMapping
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("usuarios");
        modelAndView.addObject("usuarios", usuarioRepositorio.findAll());
        return modelAndView;
    }
    
}
