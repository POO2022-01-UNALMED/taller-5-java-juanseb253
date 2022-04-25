package gestion;

import java.util.ArrayList;


public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas = new ArrayList<Zona>();
	
	public Zoologico () {
		this(null, null);
		}
	public Zoologico (String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public int cantidadTotalAnimales() {
		int e = 0;
		for (int i = 0; i < zonas.size(); i++) {
			e = e + zonas.get(i).cantidadAnimales();
		}
		return e;
	}
}
