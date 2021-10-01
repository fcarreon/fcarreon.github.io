/* 
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: Imprime primeros N elementos de la Serie: 1, 8, 243, 16384, 1953125...
 */
 
import javax.swing.JOptionPane;
import java.lang.Math;

public class Tarea_10 {
	public static void main(String[] args) {
		int i, elementos, x;
		double sucesion;
		String entrada, mensaje;
		
		entrada = JOptionPane.showInputDialog("Ingrese el total de elementos:");
		elementos = Integer.parseInt(entrada);
		
		sucesion = 0;
		x=0;
		mensaje="";
		for(i = 1; i <= elementos; i++) {
			sucesion= Math.pow(i,(2*i-1));
			x=(int)sucesion; // Convierte Double a int
			mensaje += x + ", ";
		}
		JOptionPane.showMessageDialog(null, "Lo primeros " + elementos + " de la serie son:\n" + mensaje);
	} //fin main
} //fin clase