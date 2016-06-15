//Version 3.1
package org.Iteracion3;
import java.util.List;
public class Cocinero {
	private Servidor server;
	public void anadirproductonuevo(Producto p){ // Este metodo seria de un administrador pero como no lo hemos uesto lo hemos metido aqui
		server.anadirproducto(p);
	}
	public List<Pedido> mostrarpedidos(){
		return server.listarpedidos();
	}
}
