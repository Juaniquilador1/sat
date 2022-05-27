package com.sat.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sat.modelo.Usuario;
import com.sat.servicios.ServicioUsuario;


@Controller
public class UsuarioController {
	
	@Autowired
	ServicioUsuario servicioUsuario;
	
	@GetMapping(path= {"/login/validar", "/"})
	public String validar()
	{
		return "login/validar";
	}
	
	@PostMapping("/login/validar")
	public String validar(@RequestParam("rfc")String rfc, @RequestParam("contrasena") String contrasena, Model modelo, HttpSession sesion)
	{
		boolean res = servicioUsuario.validar(rfc, contrasena, sesion);
		if(res)
		{
			return "redirect:/temas/listar";
		}
		modelo.addAttribute("error", servicioUsuario.getMensaje());
		modelo.addAttribute("rfc", rfc);
		modelo.addAttribute("contrasena", contrasena);
		return "/usuario/validar";
	}
	
	@GetMapping("/login/agregar")
	public String agregar(Model model)
	{
		model.addAttribute("usuario", new Usuario());
		return "login/agregar";
	}
	
	@PostMapping("/login/agregar")
	public String agregar(Model modelo, @ModelAttribute Usuario user, @RequestParam("contrasena") String contrasena, HttpSession sesion)
	{
		boolean res= servicioUsuario.agregar(user, contrasena, sesion);
		if(res)
		{
			return "redirect:/temas/listar";
		}
		modelo.addAttribute("error", servicioUsuario.getMensaje());
		return "/login/agregar";
	}
}