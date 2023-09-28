package actividad2;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		String nombre = "";
		String apellidos = "";
		int dia;
		int mes;
		int ano;
		LocalDate anoActual = LocalDate.now();
		StringBuilder mensaje = new StringBuilder();

		nombre = (JOptionPane.showInputDialog("Introduzca su nombre:"));
		apellidos = (JOptionPane.showInputDialog("Introduzca sus apellidos:"));

		do {
			dia = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su día de nacimiento:"));
		} while (dia < 1 || dia > 31);

		do {
			mes = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su mes de nacimiento:"));
		} while (mes < 1 || mes > 12);

		do {
			ano = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su año de nacimiento:"));
		} while (ano > anoActual.getYear() || ano < 1900);

		mensaje.append("¡Hola, ").append(nombre).append(" ").append(apellidos).append("!\n");
		mensaje.append("Su fecha de nacimiento es: ").append(dia).append("/").append(mes).append("/").append(ano);
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
