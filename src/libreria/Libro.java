package libreria;

public class Libro {
	private String titulo;
	private double precio;
	private Libreria libreria;
	
	public Libro(String titulo, double precio, Libreria libreria) {
		this.titulo = titulo;
		this.precio = precio;
		this.libreria = libreria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", precio=" + precio + ", libreria=" + libreria + "]";
	}
	
}
