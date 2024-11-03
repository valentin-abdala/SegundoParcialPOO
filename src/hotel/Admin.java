package hotel;

public class Admin extends Usuario {
	private Hotel hotel;

	public Admin(String nombre, String contrasena, Hotel hotel) {
		super(nombre, contrasena);
		this.hotel = hotel;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Admin [hotel=" + hotel + "]";
	}
	
}
