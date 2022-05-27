package com.sat.servicios;

import java.security.MessageDigest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.modelo.Usuario;

@Service
public class ServicioUsuario {
	
	@Autowired
	private RepoUsuario repoUsuario;
	private String Mensaje;
	
	public String getMensaje() {
		return Mensaje;
	}
	
	public void setMensaje(String mensaje) {
		Mensaje = mensaje;
	}
	
	public boolean validar(String rfc, String contrasena, HttpSession sesion)
	{
		Usuario usr = repoUsuario.validar(rfc, encriptar(contrasena));
		if(usr != null) {
			Mensaje = usr.getRfc() + " _ " + usr.getContrasena();
			return true;
		}
		Mensaje = "Datos de acceso incorrectos";
		return false;
	}
		
		private byte[] encriptar(String contrasena) {
			try {
				MessageDigest digest = MessageDigest.getInstance("SHA-1");
				digest.reset();
				digest.update(contrasena.getBytes("utf8"));
				return digest.digest();
			}catch (Exception e) {
				return null;
			}
		}
		
		public boolean agregar(Usuario u, String contrasena, HttpSession sesion) {
			try {
				sesion.setAttribute("iduser", u.getRfc());
				u.setContrasena(encriptar(contrasena));
				repoUsuario.save(u);
				this.Mensaje = "Datos del usuario almacenados correctamente";
				return true;
			} catch (Exception e) {
				this.Mensaje = "Error al registrarse";
				return false;
			}
	}
}
