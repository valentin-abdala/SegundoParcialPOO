package libreria;

public class Libro {
	private String titulo;
	private String autor;
	private String genero;
	private double precio;
	private Libreria libreria;

	public Libro(String titulo, String autor, String genero, double precio, Libreria libreria) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.precio = precio;
		this.libreria = libreria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", genero=" + genero + ", precio=" + precio
				+ ", libreria=" + libreria + "]";
	}
	
}
