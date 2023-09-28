package actividad2;

import javax.swing.*;
import java.time.LocalDate;
import java.awt.*;

public class Ejercicio1 {
	public static void main(String[] args) {
		String nombre = "";
		String apellidos = "";
		StringBuilder mensaje = new StringBuilder();

		nombre = (JOptionPane.showInputDialog("Introduzca su nombre:"));
		apellidos = (JOptionPane.showInputDialog("Introduzca sus apellidos:"));

		mensaje.append("¡Hola, ").append(nombre).append(" ").append(apellidos).append("!\n");
		JOptionPane.showMessageDialog(null, mensaje);
	}
}