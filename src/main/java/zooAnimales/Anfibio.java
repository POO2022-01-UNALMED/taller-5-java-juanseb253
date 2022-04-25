package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;


public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
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
		listado.add(this);
	}
	
	public String getColorPiel() {
		return colorpiel;
	}
	public void setColorPiel(String color) {
		colorpiel = color;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		ranas ++; 
		return a;
	}
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio a = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		salamandras ++;
		return a;
	}
}
