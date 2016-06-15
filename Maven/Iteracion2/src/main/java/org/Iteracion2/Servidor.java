//Version 2.1
package org.Iteracion2;
import java.util.List;
import java.util.ArrayList;
public class Servidor {
	private List<Producto> productos=new ArrayList();

	public Servidor() {
		super();
	}
	public List<Producto> listarproductos(){
		return productos;
	}
	public void anadirproducto(Producto p) {
		productos.add(p);
	}
}
