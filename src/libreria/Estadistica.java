package libreria;

import javax.swing.JOptionPane;

public class Estadistica {
	private String libroMasVendido;
	private String autorMasPopular;
	private String generoMasVendido;
	private int ventasTotales;
	private double totalFacturado;
	
	public Estadistica(String libroMasVendido, String autorMasPopular, String generoMasVendido, int ventasTotales, double totalFacturado) {
		this.libroMasVendido = libroMasVendido;
		this.autorMasPopular = autorMasPopular;
		this.generoMasVendido = generoMasVendido;
		this.ventasTotales = ventasTotales;
		this.totalFacturado = totalFacturado;
	}

	public String getLibroMasVendido() {
		return libroMasVendido;
	}

	public void setLibroMasVendido(String libroMasVendido) {
		this.libroMasVendido = libroMasVendido;
	}
	
	public String getAutorMasPopular() {
		return autorMasPopular;
	}

	public void setAutorMasPopular(String autorMasPopular) {
		this.autorMasPopular = autorMasPopular;
	}

	public String getGeneroMasVendido() {
		return generoMasVendido;
	}

	public void setGeneroMasVendido(String generoMasVendido) {
		this.generoMasVendido = generoMasVendido;
	}

	public int getVentasTotales() {
		return ventasTotales;
	}

	public void setVentasTotales(int ventasTotales) {
		this.ventasTotales = ventasTotales;
	}

	public double getTotalFacturado() {
		return totalFacturado;
	}

	public void setTotalFacturado(double totalFacturado) {
		this.totalFacturado = totalFacturado;
	}

	@Override
	public String toString() {
		return "Estadistica [libroMasVendido=" + libroMasVendido + "autorMasPopular=" + autorMasPopular + ", generoMasVendido=" + generoMasVendido
				+ ", ventasTotales=" + ventasTotales + ", totalFacturado=" + totalFacturado + "]";
	}
	
	public void registrarEstadisticas(Libro libro1, Libro libro2, Libro libro3) {
		String[] libros = { libro1.getTitulo(), libro2.getTitulo(), libro3.getTitulo() };
		String[] autores = { libro1.getAutor(), libro2.getAutor(), libro3.getAutor() };
		String[] generos = { libro1.getGenero(), libro2.getGenero(), libro3.getGenero() };

		int libro = JOptionPane.showOptionDialog(null, "Selecciona el libro más vendido.", null, 1, 1, null, libros, libros[0]);
		int autor = JOptionPane.showOptionDialog(null, "Selecciona el autor más popular.", null, 1, 1, null, autores, autores[0]);
		int genero = JOptionPane.showOptionDialog(null, "Selecciona el género más vendido.", null, 1, 1, null, generos, generos[0]);
		
		switch (libro) {
		case 0:
			libroMasVendido = libro1.getTitulo();
			break;
		case 1:
			libroMasVendido = libro2.getTitulo();
			break;
		case 2:
			libroMasVendido = libro3.getTitulo();
			break;
		}
		
		switch (autor) {
		case 0:
			autorMasPopular = libro1.getAutor();
			break;
		case 1:
			autorMasPopular = libro2.getAutor();
			break;
		case 2:
			autorMasPopular = libro3.getAutor();
			break;
		}
		
		switch (genero) {
		case 0:
			generoMasVendido = libro1.getGenero();
			break;
		case 1:
			generoMasVendido = libro2.getGenero();
			break;
		case 2:
			generoMasVendido = libro3.getGenero();
			break;
		}
	}
	
	public void calcularTotalFacturado() {
		if (libroMasVendido.equals("")) {
			JOptionPane.showMessageDialog(null, "Registra los más vendidos antes.");
		} else {
			int ventasDiarias = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad aproximada de libros vendidos por día."));
			ventasTotales = ventasDiarias * 26;
			
			if (libroMasVendido.equals("El Señor de los Anillos")) {
				totalFacturado = ventasTotales * 6000;
			} else if (libroMasVendido.equals("Harry Potter")) {
				totalFacturado = ventasTotales * 4000;
			} else if (libroMasVendido.equals("Don Quijote")) {
				totalFacturado = ventasTotales * 2000;
			}
		}
	}
	
	public void verEstadisticas() {
		if (totalFacturado == 0) {
			JOptionPane.showMessageDialog(null, "Registra todos los datos antes.");
		} else {
			String mes = validarCadena(JOptionPane.showInputDialog("Ingresa el mes de las estadísticas."));
			JOptionPane.showMessageDialog(null, "Estadísticas de " + mes + " (no operamos los domingos)"
					+ "\nLibro más vendido: " + libroMasVendido 
					+ "\nAutor más popular: " + autorMasPopular 
					+ "\nGénero más vendido: " + generoMasVendido 
					+ "\nVentas totales: " + ventasTotales 
					+ "\nTotal facturado: $" + totalFacturado);
		}
	}
	
	public String validarCadena(String cadena) {
		while (cadena.isEmpty()) {
			cadena = JOptionPane.showInputDialog("Error. Reingresa los datos.");
		}
		return cadena;
	}
	
}
