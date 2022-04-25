package zooAnimales;

import gestion.Zona;

public class Anfibio extends Animal{
	private static Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorpiel;
	private boolean venenoso;
	
	public Anfibio() {

	}
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorpiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorpiel = colorpiel;
		this.venenoso = venenoso;
	}
	
	public String getColorpiel() {
		return colorpiel;
	}
	public void setColorpiel(String color) {
		colorpiel = color;
	}
	public boolean getVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static int cantidadAnfibios() {
		return listado.length;
	}
	public String movimiento() {
		return "saltar";
	}
	public void crearRanas(String nombre, int edad, String genero) {
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas ++; 
	}
	public void crearSalamandra(String nombre, int edad, String genero) {
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras ++;
	}
}
