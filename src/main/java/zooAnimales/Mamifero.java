package zooAnimales;

import gestion.Zona;

public class Mamifero extends Animal {
	private static Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {

	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
	}
	
	public static Mamifero[] getListado() {
		return listado;
	}
	public static void setListado(Mamifero[] lista) {
		listado = lista;
	}
	public boolean getPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public static int cantidadMamiferos() {
		return listado.length;
	}
	public void crearCaballo(String nombre, int edad, String genero) {
		Mamifero a = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos ++;
	}
	public void crearLeon(String nombre, int edad, String genero) {
		Mamifero a = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones ++;
	}
}
