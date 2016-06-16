//Version 5.4
package org.Iteracion5;
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
	public void listopedido(Pedido pedido) {
			boolean continuar=false;
			int i=0;
			do{
				if(pedido.getId()==pedidos.get(i).getId()){
					continuar=true;
				}else{
					i++;
				}
			}while(continuar==true || i==pedidos.size());
	}
	public Pedido ConfirmarPedido(Pedido pedido) {
		Pedido ped=null;
		boolean continuar=false;
		int i=0;
		do{
			if(pedido.getId()==pedidos.get(i).getId()){
				ped=pedidos.remove(i);
				continuar=true;
			}else{
				i++;
			}
		}while(continuar==true || i==pedidos.size());
		return ped;
	}
}