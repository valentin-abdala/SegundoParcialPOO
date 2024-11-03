package libreria;

public class Cliente extends Usuario {
	private String direccion;
	private int metodoPago;
	private int numeroTarjeta;
	private Libro libroSeleccionado;
	
	public Cliente(String nombre, String contrasena, String direccion, int metodoPago, int numeroTarjeta,
			Libro libroSeleccionado) {
		super(nombre, contrasena);
		this.direccion = direccion;
		this.metodoPago = metodoPago;
		this.numeroTarjeta = numeroTarjeta;
		this.libroSeleccionado = libroSeleccionado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(int metodoPago) {
		this.metodoPago = metodoPago;
	}

	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public Libro getLibroSeleccionado() {
		return libroSeleccionado;
	}

	public void setLibroSeleccionado(Libro libroSeleccionado) {
		this.libroSeleccionado = libroSeleccionado;
	}

	@Override
	public String toString() {
		return "Cliente [direccion=" + direccion + ", metodoPago=" + metodoPago + ", numeroTarjeta=" + numeroTarjeta
				+ ", libroSeleccionado=" + libroSeleccionado + "]";
	}
		
}
