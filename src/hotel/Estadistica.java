package hotel;

import javax.swing.JOptionPane;

public class Estadistica {
	private int huespedesRecibidos;
	private int huespedesH1;
	private int huespedesH2;
	private int huespedesH3;
	private int huespedesH4;
	private double totalFacturado;
	
	public Estadistica(int huespedesRecibidos, int huespedesH1, int huespedesH2, int huespedesH3, int huespedesH4,
			double totalFacturado) {
		this.huespedesRecibidos = huespedesRecibidos;
		this.huespedesH1 = huespedesH1;
		this.huespedesH2 = huespedesH2;
		this.huespedesH3 = huespedesH3;
		this.huespedesH4 = huespedesH4;
		this.totalFacturado = totalFacturado;
	}

	public int getHuespedesRecibidos() {
		return huespedesRecibidos;
	}

	public void setHuespedesRecibidos(int huespedesRecibidos) {
		this.huespedesRecibidos = huespedesRecibidos;
	}

	public int getHuespedesH1() {
		return huespedesH1;
	}

	public void setHuespedesH1(int huespedesH1) {
		this.huespedesH1 = huespedesH1;
	}

	public int getHuespedesH2() {
		return huespedesH2;
	}

	public void setHuespedesH2(int huespedesH2) {
		this.huespedesH2 = huespedesH2;
	}

	public int getHuespedesH3() {
		return huespedesH3;
	}

	public void setHuespedesH3(int huespedesH3) {
		this.huespedesH3 = huespedesH3;
	}

	public int getHuespedesH4() {
		return huespedesH4;
	}

	public void setHuespedesH4(int huespedesH4) {
		this.huespedesH4 = huespedesH4;
	}

	public double getTotalFacturado() {
		return totalFacturado;
	}

	public void setTotalFacturado(double totalFacturado) {
		this.totalFacturado = totalFacturado;
	}

	@Override
	public String toString() {
		return "Estadistica [huespedesRecibidos=" + huespedesRecibidos + ", huespedesH1=" + huespedesH1
				+ ", huespedesH2=" + huespedesH2 + ", huespedesH3=" + huespedesH3 + ", huespedesH4=" + huespedesH4
				+ ", totalFacturado=" + totalFacturado + "]";
	}
	
	public void registrarEstadisticas() {
		huespedesH1 = validarInteger(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de huéspedes de habitaciones individuales.")));
		huespedesH2 = validarInteger(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de huéspedes de habitaciones dobles.")));
		huespedesH3 = validarInteger(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de huéspedes de habitaciones con vistas a la ciudad.")));
		huespedesH4 = validarInteger(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de huéspedes de suites presidenciales.")));
		
		huespedesRecibidos = huespedesH1 + huespedesH2 + huespedesH3 + huespedesH4;
		
		totalFacturado = (10000 * huespedesH1) + (20000 * huespedesH2) + (35000 * huespedesH3) + (100000 * huespedesH4);
	}
	
	public void verEstadisticas() {
		if (totalFacturado == 0) {
			JOptionPane.showMessageDialog(null, "Registra las estadísticas antes.");
		} else {
			JOptionPane.showMessageDialog(null, "Hotel Torres del Sol\nHuéspedes recibidos: " + huespedesRecibidos
					+ "\nHuéspedes de habitaciones individuales: " + huespedesH1
					+ "\nHuéspedes de habitaciones dobles: " + huespedesH2
					+ "\nHuéspedes de habitaciones con vistas a la ciudad: " + huespedesH3
					+ "\nHuéspedes de suites presidenciales: " + huespedesH4
					+ "\nTotal facturado: $" + totalFacturado);			
		}
	}
	
	public int validarInteger(int numero) {
		while (numero < 0) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Error. Reingresa los datos."));
		}
		return numero;
	}
}
