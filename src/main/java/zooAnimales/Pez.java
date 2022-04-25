package zooAnimales;

import gestion.Zona;

public class Pez extends Animal{
	private static Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {

	}
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String color) {
		colorEscamas = color;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cant) {
		cantidadAletas = cant;
	}
	
	public static int cantidadPeces() {
		return listado.length;
	}
	public String movimiento() {
		return "nadar";
	}
	public static void crearSalmon(String nombre, int edad, String genero) {
		Pez a = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones ++;
	}
	public static void crearBacalao(String nombre, int edad, String genero) {
		Pez a = new Pez(nombre, edad, "oceano", genero, "gris", 6	);
		bacalaos ++;
	}
}
