//Version 4.2
package org.Iteracion6;
import java.util.List;
public class Cocinero {
	private Servidor server;
	public void anadirproductonuevo(Producto p){ // Este metodo seria de un administrador pero como no lo hemos uesto lo hemos metido aqui
		server.anadirproducto(p);
	}
	public List<Pedido> mostrarpedidos(){
		return server.listarpedidos();
	}
	public void pedidolisto(Pedido ped){
		server.listopedido(ped);
	}
}
