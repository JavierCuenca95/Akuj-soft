//Version 1.0
package org.Iteracion6;

public class Producto {
	private String Nombre;
	private double Precico;
	public Producto(String nombre, double precico) {
		super();
		Nombre = nombre;
		Precico = precico;
	}
	@Override
	public String toString() {
		return "Producto [Nombre=" + Nombre + ", Precico=" + Precico + "]";
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecico() {
		return Precico;
	}
	public void setPrecico(double precico) {
		Precico = precico;
	}
}
