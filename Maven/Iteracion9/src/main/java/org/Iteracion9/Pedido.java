//Version 8.2
package org.Iteracion9;
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
	public void EliminarProductoPed(Producto producto) {
		int i=0;
		boolean continuar=true;
		do{
			Producto prod=productos.get(i);
			if(prod.getNombre().equals(producto.getNombre())){
				productos.remove(i);
				continuar=false;
			}else if(i==productos.size()){
				System.out.println("Producto no encontrado");
				continuar=false;
			}else{
				i++;
			}
		}while(i<productos.size() || continuar==false);
	}
		
}
