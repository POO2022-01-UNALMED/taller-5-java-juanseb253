package gestion;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private Zona[] zonas;
	
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
	public Zona[] getZonas() {
		return zonas;
	}
	
	public void agregarZonas(Zona zona) {
		
	}
	public int cantidadTotalAnimales() {
		int e = 0;
		for (int i = 0; i < zonas.length; i++) {
			e = e + zonas[i].cantidadAnimales();
		}
		return e;
	}
}
