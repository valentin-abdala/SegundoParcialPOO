package hotel;

import javax.swing.JOptionPane;

public class Habitacion {
	private int numeroHabitacion;
	private boolean ocupado;
	private String tipo;
	private double precioXNoche;
	private Hotel hotel;
	
	public Habitacion(int numeroHabitacion, boolean ocupado, String tipo, double precioXNoche, Hotel hotel) {
		this.numeroHabitacion = numeroHabitacion;
		this.ocupado = ocupado;
		this.tipo = tipo;
		this.precioXNoche = precioXNoche;
		this.hotel = hotel;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioXNoche() {
		return precioXNoche;
	}

	public void setPrecioXNoche(double precioXNoche) {
		this.precioXNoche = precioXNoche;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", ocupado=" + ocupado + ", tipo=" + tipo
				+ ", precioXNoche=" + precioXNoche + ", hotel=" + hotel + "]";
	}
	
	public void verificarDisponibilidad(Huesped huesped) {
		if (huesped.getHabitacionDeseada() == null) {
			JOptionPane.showMessageDialog(null, "Selecciona una habitación antes.");
			String[] opcionesExtras = { "Reservar otro tipo", "Cancelar" };
			
			if (huesped.getHabitacionDeseada().isOcupado()) {
				int opcion = JOptionPane.showOptionDialog(null, "Lo sentimos, ese tipo de habitación no se encuentra disponible. Puedes reservar otro tipo de habitación si lo deseas.", null, 1, 1, null, opcionesExtras, opcionesExtras[0]);
			} else {
				huesped.setDias(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de noches que deseas.")));
				setPrecioXNoche(getPrecioXNoche() * huesped.getDias());
				
				JOptionPane.showMessageDialog(null, "Monto a pagar: $" + getPrecioXNoche());
				
				int tarjeta = validarInteger(Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu número de tarjeta.")));
				
				JOptionPane.showMessageDialog(null, "Reserva realizada con éxito.");
			}
		}
	}
	
	public int validarInteger(int numero) {
		while (numero < 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Error. Reingresa los datos."));
		}
		return numero;
	}
}
