//Version 7.3
package org.Iteracion7;
import java.util.List;
public class Cocinero {
	private Servidor server;
	private String Usuario;
	private String Contrasenia;
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getContrasenia() {
		return Contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}
	public void anadirproductonuevo(Producto p){ // Este metodo seria de un administrador pero como no lo hemos uesto lo hemos metido aqui
		server.anadirproducto(p);
	}
	public Cocinero(String usuario, String contrasenia){
		Usuario=usuario;
		Contrasenia=contrasenia;
	}
	public List<Pedido> mostrarpedidos(){
		return server.listarpedidos();
	}
	public void pedidolisto(Pedido ped){
		server.listopedido(ped);
	}
	public void Login(String Usu, String Contra) {
		boolean si=server.LoginCocinero(Usu, Contra);
		if(si==true){
			System.out.println("Login correcto");
		}else{
			System.out.println("Usuario o contraseña incorrecto");
		}
	}
	public void Registrarse(String Usu, String Contra){
		Cocinero cocinero=new Cocinero(Usu, Contra);
		server.RegistrarCocinero(cocinero);
		System.out.println("Registro completado");
		
	}
}
