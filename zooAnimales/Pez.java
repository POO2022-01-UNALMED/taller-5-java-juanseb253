package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;
public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
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
		return listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez a = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones ++;
		return a;
	}
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez a = new Pez(nombre, edad, "oceano", genero, "gris", 6	);
		bacalaos ++;
		return a;
	}
}
