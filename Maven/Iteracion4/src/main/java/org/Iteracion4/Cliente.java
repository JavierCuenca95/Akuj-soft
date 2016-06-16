//Version 2.1
package org.Iteracion4;
import java.util.List;

public class Cliente {
	private Servidor server;
	private Pedido ped;
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
}
