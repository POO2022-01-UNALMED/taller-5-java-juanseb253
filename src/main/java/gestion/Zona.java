package gestion;

import zooAnimales.Animal;
public class Zona {
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
	public Zona() {
		this(null, null);
	}
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public Animal[] getAnimales() {
		return animales;
	}

	
	public void agregarAnimales() {
		
	}
	public int cantidadAnimales() {
		return animales.length;
	}
}
