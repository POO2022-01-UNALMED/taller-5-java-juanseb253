package zooAnimales;

import gestion.Zona;

public class Ave extends Animal{
	private static Mamifero[] listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {

	}
	public Ave (String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
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
		return listado.length;
	}
	public static void crearHalcon(String nombre, int edad, String genero) {
		Ave a = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones ++;
	}
	public static void crearAguila(String nombre, int edad, String genero) {
		Ave a = new Ave(nombre, edad, "blanco y amarillo", genero, "cafe glorioso");
		aguilas ++;
	}
}
