package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;
public class Reptil extends Animal{
	private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		listado.add(this);
	}
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
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
		return listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil a = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
		iguanas ++;
		return a;
	}
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil a = new Reptil(nombre, edad, "jungla", genero, "blanco", 1	);
		serpientes ++;
		return a;
	}
}
