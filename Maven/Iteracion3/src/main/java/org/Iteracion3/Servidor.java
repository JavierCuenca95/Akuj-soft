//Version 3.2
package org.Iteracion3;
import java.util.List;
import java.util.ArrayList;
public class Servidor {
	private List<Producto> productos=new ArrayList();
	private List<Pedido> pedidos=new ArrayList();
	public Servidor() {
		super();
	}
	public List<Producto> listarproductos(){
		return productos;
	}
	public void anadirproducto(Producto p) {
		productos.add(p);
	}
	public List<Pedido> listarpedidos(){
		return pedidos;
	}
}
