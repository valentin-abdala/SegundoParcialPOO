package libreria;

import javax.swing.JOptionPane;

public class Admin extends Usuario {
	private Libreria libreria;

	public Admin(String nombre, String contrasena, Libreria libreria) {
		super(nombre, contrasena);
		this.libreria = libreria;
	}

	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}

	@Override
	public String toString() {
		return "Admin [libreria=" + libreria + "]";
	}
	
	@Override
	public void registrar() {
		super.registrar();
	}

	@Override
	public void mostrarDatos(Libreria libreria) {
		super.mostrarDatos(libreria);
		JOptionPane.showMessageDialog(null, "Usuario: Administrador\nNombre: " + nombre + "\nContraseña: " + contrasena + "\nLibrería: " + libreria.getNombre());
	}

}
