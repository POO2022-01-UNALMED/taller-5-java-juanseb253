package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		listado.add(this);
	}
	public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String color) {
		colorPlumas = color;
	}
	
	public String movimiento() {
		return "volar";
	}
	public static int cantidadAves() {
		return listado.size();
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave a = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones ++;
		return a;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave a = new Ave(nombre, edad, "blanco y amarillo", genero, "cafe glorioso");
		aguilas ++;
		return a;
	}
}
