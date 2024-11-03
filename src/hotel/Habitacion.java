package hotel;

public class Habitacion {
	private int numeroHabitacion;
	private boolean ocupado;
	private Hotel hotel;
	
	public Habitacion(int numeroHabitacion, boolean ocupado, Hotel hotel) {
		this.numeroHabitacion = numeroHabitacion;
		this.ocupado = ocupado;
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

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Habitacion [numeroHabitacion=" + numeroHabitacion + ", ocupado=" + ocupado + ", hotel=" + hotel + "]";
	}
	
}
