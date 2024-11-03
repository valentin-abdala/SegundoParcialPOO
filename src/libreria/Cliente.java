package libreria;

import javax.swing.JOptionPane;

public class Cliente extends Usuario {
	private String direccion;
	private String metodoPago;
	private int numeroTarjeta;
	private Libro libroSeleccionado;
	
	public Cliente(String nombre, String contrasena, String direccion, String metodoPago, int numeroTarjeta,
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

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
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
		
	@Override
	public void registrar() {
		super.registrar();
		direccion = validarCadena(JOptionPane.showInputDialog("Ingresa tu dirección."));
	}
	
	public void seleccionarLibro(Libro libro1, Libro libro2, Libro libro3) {
		String[] libros = { libro1.getTitulo(), libro2.getTitulo(), libro3.getTitulo() };
		
		int libro = JOptionPane.showOptionDialog(null, "Selecciona el libro más vendido.", null, 1, 1, null, libros, libros[0]);
		
		switch (libro) {
		case 0:
			libroSeleccionado = libro1;
			break;
		case 1:
			libroSeleccionado = libro2;
			break;
		case 2:
			libroSeleccionado = libro3;
			break;
		}
		
		JOptionPane.showMessageDialog(null, "Libro seleccionado: " + libroSeleccionado.getTitulo());
	}
	
	public void finalizarCompra() {
		if (libroSeleccionado == null) {
			JOptionPane.showMessageDialog(null, "Selecciona un libro antes.");
		} else {
			JOptionPane.showMessageDialog(null, "Monto a pagar: $" + libroSeleccionado.getPrecio());
			String[] metodosPago = { "Tarjeta", "Mercado Pago (5% de descuento)", "Efectivo (10% de descuento)" };
			
			int formaPago = JOptionPane.showOptionDialog(null, "Selecciona el método de pago que utilizarás.", null, 1, 1, null, metodosPago, metodosPago[0]);
			
			switch (formaPago) {
			case 0:
				metodoPago = "Tarjeta";
				
				numeroTarjeta = validarInteger(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu número de tarjeta.")));
				break;
			case 1:
				metodoPago = "Mercado Pago";
				
				libroSeleccionado.setPrecio(libroSeleccionado.getPrecio() * 0.95);
				JOptionPane.showMessageDialog(null, "Monto con descuento: $" + libroSeleccionado.getPrecio());
				break;
			case 2:
				metodoPago = "Efectivo";
				
				libroSeleccionado.setPrecio(libroSeleccionado.getPrecio() * 0.90);
				JOptionPane.showMessageDialog(null, "Monto con descuento: $" + libroSeleccionado.getPrecio());
				break;
			}
			JOptionPane.showMessageDialog(null, "Compra realizada con éxito. Su libro, " 
					+ libroSeleccionado.getTitulo() + " de " + libroSeleccionado.getAutor() 
					+ ", llegará en las siguientes 48 horas a " + direccion + ".");
		}
	}

	@Override
	public void mostrarDatos(Libreria libreria) {
		super.mostrarDatos(libreria);
		if (metodoPago.equals("")) {
			JOptionPane.showMessageDialog(null, "Usuario: Cliente\nNombre: " + nombre + "\nContraseña: " + contrasena + "\nDirección: " + direccion + "\nMétodo de pago: Indefinido");
		} else {
			JOptionPane.showMessageDialog(null, "Usuario: Cliente\nNombre: " + nombre + "\nContraseña: " + contrasena + "\nDirección: " + direccion + "\nMétodo de pago: " + metodoPago);
		}
	}
	
	public String validarCadena(String cadena) {
		while (cadena.isEmpty()) {
			cadena = JOptionPane.showInputDialog("Error. Reingresa los datos.");
		}
		return cadena;
	}
	
	public int validarInteger(int numero) {
		while (numero < 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Error. Reingresa los datos."));
		}
		return numero;
	}
	
}
