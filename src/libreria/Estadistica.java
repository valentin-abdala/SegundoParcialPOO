package libreria;

public class Estadistica {
	private String libroMasVendido;
	private String generoMasVendido;
	private int ventasTotales;
	private double totalFacturado;
	
	public Estadistica(String libroMasVendido, String generoMasVendido, int ventasTotales, double totalFacturado) {
		this.libroMasVendido = libroMasVendido;
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
		return "Estadistica [libroMasVendido=" + libroMasVendido + ", generoMasVendido=" + generoMasVendido
				+ ", ventasTotales=" + ventasTotales + ", totalFacturado=" + totalFacturado + "]";
	}
	
}
