package libreria;

public class Libreria {
	private String nombre;
	private Estadistica estadistica;
	
	public Libreria(String nombre, Estadistica estadistica) {
		this.nombre = nombre;
		this.estadistica = estadistica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadistica getEstadistica() {
		return estadistica;
	}

	public void setEstadistica(Estadistica estadistica) {
		this.estadistica = estadistica;
	}

	@Override
	public String toString() {
		return "Libreria [nombre=" + nombre + ", estadistica=" + estadistica + "]";
	}
	
}
