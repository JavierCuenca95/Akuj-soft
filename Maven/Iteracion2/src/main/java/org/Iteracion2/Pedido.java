//Version 2.0
package org.Iteracion2;
import java.util.List;
import java.util.ArrayList;
public class Pedido {
	private Servidor server;
	private List<Producto> productos;
	public Pedido() {
		super();
	}
	public void anadirproductopedido(Producto p){
		productos.add(p);
	}
}
