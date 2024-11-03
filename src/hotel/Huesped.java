package hotel;

import javax.swing.JOptionPane;

public class Huesped extends Usuario {
	private String pasaporte;
	private int telefono;
	private String mail;
	private int dias;
	private Habitacion habitacionDeseada;
	private boolean reservaHecha;

	public Huesped(String nombre, String contrasena, String pasaporte, int telefono, String mail, int dias,
			Habitacion habitacionDeseada, boolean reservaHecha) {
		super(nombre, contrasena);
		this.pasaporte = pasaporte;
		this.telefono = telefono;
		this.mail = mail;
		this.dias = dias;
		this.habitacionDeseada = habitacionDeseada;
		this.reservaHecha = reservaHecha;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public Habitacion getHabitacionDeseada() {
		return habitacionDeseada;
	}

	public void setHabitacionDeseada(Habitacion habitacionDeseada) {
		this.habitacionDeseada = habitacionDeseada;
	}

	public boolean isReservaHecha() {
		return reservaHecha;
	}

	public void setReservaHecha(boolean reservaHecha) {
		this.reservaHecha = reservaHecha;
	}
	
	@Override
	public String toString() {
		return "Huesped [pasaporte=" + pasaporte + ", telefono=" + telefono + ", mail=" + mail + ", dias=" + dias
				+ ", habitacionDeseada=" + habitacionDeseada + ", reservaHecha=" + reservaHecha + "]";
	}

	@Override
	public void registrar() {
		super.registrar();
		pasaporte = validarCadena(JOptionPane.showInputDialog("Ingresa tu pasaporte."));
		telefono = validarInteger(Integer.parseInt("Ingresa tu número telefónico."));
		mail = validarCadena(JOptionPane.showInputDialog("Ingresa tu correo electrónico."));
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
