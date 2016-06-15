//Version 1.0
package org.Iteracion1;
import java.util.List;
public class Cliente {
	private Servidor server;
	public List<Producto> MostarListaProductos() {
		return server.listarproductos();
	}
	public void mostrarproductos(){
		List<Producto> p=server.listarproductos();
		for(int i=0; i<p.size();i++){
			p.get(i).getNombre();
		}
	}
}
