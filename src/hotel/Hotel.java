package hotel;

import javax.swing.JOptionPane;

public class Hotel {
	private String nombre;
	private String ciudad;
	private Estadistica estadistica;
	
	public Hotel(String nombre, String ciudad, Estadistica estadistica) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.estadistica = estadistica;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Estadistica getEstadistica() {
		return estadistica;
	}

	public void setEstadistica(Estadistica estadistica) {
		this.estadistica = estadistica;
	}

	public void realizarReserva(Huesped huesped, Habitacion habitacion1, Habitacion habitacion2, Habitacion habitacion3, Habitacion habitacion4) {
		if (!huesped.isReservaHecha()) {
			String[] tiposHabitacion = { habitacion1.getTipo(), habitacion2.getTipo(), habitacion3.getTipo(), habitacion4.getTipo() };
			
			int tipo = JOptionPane.showOptionDialog(null, "Selecciona un tipo de habitación.", null, 1, 1, null, tiposHabitacion, tiposHabitacion[0]);
			
			switch (tipo) {
			case 0:
				huesped.setHabitacionDeseada(habitacion1);
				break;
			case 1:
				huesped.setHabitacionDeseada(habitacion2);
				break;
			case 2:
				huesped.setHabitacionDeseada(habitacion3);
				break;
			case 3:
				huesped.setHabitacionDeseada(habitacion4);
				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Ya tienes una reserva.");
		}
	}
	
}
