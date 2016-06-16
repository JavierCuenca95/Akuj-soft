//Version 8.7
package org.Iteracion8;
import java.util.List;
import java.util.ArrayList;
public class Servidor {
	private List<Producto> productos=new ArrayList();
	private List<Pedido> pedidos=new ArrayList();
	private List<Cliente> clientes=new ArrayList();
	private List<Cocinero> cocineros=new ArrayList();
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
	public boolean LoginCliente(String Usuario, String Contrasenia) {
		boolean correcto=false;
		int i=0;
		do{
			if(Usuario.equals(clientes.get(i).getUsuario())){
				if(Contrasenia.equals(clientes.get(i).getContrasenia())){
					correcto=true;
				}
			}else{
				i++;
			}
		}while(correcto==true|| i==clientes.size());
		return correcto;
	}
	public void RegistrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void RegistrarCocinero(Cocinero cocinero) {
		cocineros.add(cocinero);
	}
	public boolean LoginCocinero(String Usuario, String Contrasenia) {
		boolean correcto=false;
		int i=0;
		do{
			if(Usuario.equals(cocineros.get(i).getUsuario())){
				if(Contrasenia.equals(cocineros.get(i).getContrasenia())){
					correcto=true;
				}
			}else{
				i++;
			}
		}while(correcto==true|| i==clientes.size());
		return correcto;
	}
	public boolean EliminarProducto(Producto producto) {
		boolean continuar=false;
		int i=0;
		do{
			if(producto.getNombre().equals(productos.get(i).getNombre())){
				continuar=true;
			}else{
				i++;
			}
		}while(continuar==true || i==pedidos.size());
		return continuar;
	}
}