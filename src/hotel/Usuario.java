package hotel;

import javax.swing.JOptionPane;

import libreria.Libreria;

public class Usuario {
	protected String nombre;
	protected String contrasena;
	
	public Usuario(String nombre, String contrasena) {
		this.nombre = nombre;
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", contrasena=" + contrasena + "]";
	}
	
	public void registrar() {
		nombre = validarCadena(JOptionPane.showInputDialog("Ingresa tu nombre."));
		contrasena = validarCadena(JOptionPane.showInputDialog("Ingresa tu contraseña."));
	}
	
	public void mostrarDatos() {
		
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
