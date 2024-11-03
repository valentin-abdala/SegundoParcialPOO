package libreria;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estadistica estadistica = new Estadistica("", "", "", 0, 0);
		Libreria libreria = new Libreria("Páginas Verdes", estadistica);
		Libro libro1 = new Libro("El Señor de los Anillos", "J. R. R. Tolkien", "Ficción de aventura", 6000, libreria);
		Libro libro2 = new Libro("El Señor de los Anillos", "J. K. Rowling", "Fantasía", 4000, libreria);
		Libro libro3 = new Libro("El Señor de los Anillos", "Miguel de Cervantes", "Novela psicológica", 2000, libreria);
		Cliente cliente = new Cliente("", "", "", 0, 0, null);
		Admin admin = new Admin("", "", libreria);
		
		String[] menuUsuario = { "Cliente", "Admin", "Salir" };
		String[] menuCliente = { "Seleccionar libro", "Finalizar compra", "Ver datos de usuario", "Salir" };
		String[] menuAdmin = { "Registrar estadísticas", "Calcular total facturado", "Ver estadísticas", "Ver datos de usuario", "Salir" };
		
		String[] metodosPago = { "Tarjeta", "Mercado Pago", "Efectivo" };
		
		int opcionUsuario = 0;
		int opcionAdmin = 0;
		int opcionCliente = 0;
		
		do {
			opcionUsuario = JOptionPane.showOptionDialog(null, "Selecciona un rol.", null, 1, 1, null, menuUsuario, menuUsuario[0]);
			
			switch (opcionUsuario) {
			case 0:
				
				cliente.registrar();
				
				do {
					switch (opcionCliente) {
					case 0:
						
						break;
					case 1:
						
						break;
					case 2:
						
						break;
					case 3:
						JOptionPane.showMessageDialog(null, "Cerrando sesión...");
						break;
					}
				} while (opcionCliente != 3);
				
				break;
			case 1:
				
				admin.registrar();
				
				do {
					switch (opcionAdmin) {
					case 0:
						
						break;
					case 1:
						
						break;
					case 2:
						
						break;
					case 3:
						
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Cerrando sesión...");
						break;
					}
				} while (opcionCliente != 4);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Cerrando sistema...");
				break;
			}
		} while (opcionUsuario != 2);
	}

}
