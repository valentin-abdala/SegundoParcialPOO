package hotel;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel("Torres del Sol", "Buenos Aires");
		Habitacion habitacion1 = new Habitacion(112, false, "Individual", 10000, hotel);
		Habitacion habitacion2 = new Habitacion(198, true, "Doble", 20000, hotel);
		Habitacion habitacion3 = new Habitacion(356, false, "Vistas a la ciudad", 35000, hotel);
		Habitacion habitacion4 = new Habitacion(475, true, "Suite presidencial", 100000, hotel);
		Huesped huesped = new Huesped("", "", "", 0, "", 0, null, false);
		Admin admin = new Admin("", "", hotel);
		
		String[] menuUsuario = { "Huésped", "Admin", "Salir" };
		String[] menuHuesped = { "Realizar reserva", "Verificar disponibilidad", "Ver datos de usuario", "Salir" };
		String[] menuAdmin = { "Registrar estadísticas", "Calcular total facturado", "Ver estadísticas", "Ver datos de usuario", "Salir" };
		
		int opcionUsuario = 0;
		int opcionHuesped = 0;
		int opcionAdmin = 0;
		
		do {
			opcionUsuario = JOptionPane.showOptionDialog(null, "Selecciona un rol.", null, 1, 1, null, menuUsuario, menuUsuario[0]);
			
			switch (opcionUsuario) {
			case 0:
				
				huesped.registrar();
				
				do {
					opcionHuesped = JOptionPane.showOptionDialog(null, "Selecciona una opción.", null, 1, 1, null, menuHuesped, menuHuesped[0]);
					
					switch (opcionHuesped) {
					case 0:
						hotel.realizarReserva(huesped, habitacion1, habitacion2, habitacion3, habitacion4);
						break;
					case 1:
						if (huesped.getHabitacionDeseada() == null) {
							JOptionPane.showMessageDialog(null, "Selecciona una habitación antes.");
						} else {
							huesped.getHabitacionDeseada().verificarDisponibilidad(huesped);
						}
						break;
					case 2:
						huesped.mostrarDatos();
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Cerrando sesión...");
						break;
					}
				} while (opcionHuesped != 3);
				break;
			case 1:
				
				admin.registrar();

				do {
					opcionAdmin = JOptionPane.showOptionDialog(null, "Selecciona una opción.", null, 1, 1, null, menuAdmin, menuAdmin[0]);
				} while (opcionAdmin != 3);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Cerrando sistema...");
				break;
			}
		} while (opcionUsuario != 2);
	}

}
