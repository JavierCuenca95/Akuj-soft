//Version 4.1
package org.Iteracion4;
import java.util.List;
import java.util.ArrayList;
public class Pedido {
	private Servidor server;
	private long id;
	private List<Producto> productos=new ArrayList();
	public Pedido() {
		super();
	}
	public void anadirproductopedido(Producto p){
		productos.add(p);
	}
	public long getId(){
		return id;
	}
}
