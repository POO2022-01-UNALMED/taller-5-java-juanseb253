package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal{
	private static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {

	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String color) {
		colorEscamas = color;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largo) {
		largoCola = largo;
	}
	
	public static int cantidadReptiles() {
		return listado.length;
	}
	public String movimiento() {
		return "reptar";
	}
	public void crearIguana(String nombre, int edad, String genero) {
		Reptil a = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas ++;
	}
	public void crearSerpiente(String nombre, int edad, String genero) {
		Reptil a = new Reptil(nombre, edad, "jungla", genero, "blanco", 1	);
		serpientes ++;
	}
}
