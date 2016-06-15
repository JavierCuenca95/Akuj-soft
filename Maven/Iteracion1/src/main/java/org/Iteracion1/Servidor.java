//Version 1.0
package org.Iteracion1;
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
}
