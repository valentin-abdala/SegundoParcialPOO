package hotel;

public class Huesped extends Usuario {
	private String pasaporte;
	private int telefono;
	private String mail;
	
	public Huesped(String nombre, String contrasena, String pasaporte, int telefono, String mail) {
		super(nombre, contrasena);
		this.pasaporte = pasaporte;
		this.telefono = telefono;
		this.mail = mail;
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

	@Override
	public String toString() {
		return "Huesped [pasaporte=" + pasaporte + ", telefono=" + telefono + ", mail=" + mail + "]";
	}
	
}
