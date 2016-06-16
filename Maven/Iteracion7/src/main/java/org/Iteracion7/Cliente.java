//Version 6.3
package org.Iteracion7;
import java.util.List;

public class Cliente {
	private Servidor server;
	public Cliente(String usuario, String contrasenia) {
		super();
		Usuario = usuario;
		Contrasenia = contrasenia;
	}
	private Pedido ped;
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
	public List<Producto> MostarListaProductos() {
		return server.listarproductos();
	}
	public void mostrarproductos(){
		List<Producto> p=server.listarproductos();
		for(int i=0; i<p.size();i++){
			p.get(i).getNombre();
		}
	}
	public void aniadirprodpedido(Producto p){
		ped.anadirproductopedido(p);
	}
	public void ConfirmarPedid(Pedido pedido) {
		server.ConfirmarPedido(pedido);
	}
	public void Login(String Usu, String Contra) {
		boolean si=server.LoginCliente(Usu, Contra);
		if(si==true){
			System.out.println("Login correcto");
		}else{
			System.out.println("Usuario o contraseña incorrecto");
		}
	}
	public void Registrar(String Usu, String Contra){
		Cliente cliente=new Cliente(Usu, Contra);
		server.RegistrarCliente(cliente);
		System.out.println("Registro Completado");
	}
}
