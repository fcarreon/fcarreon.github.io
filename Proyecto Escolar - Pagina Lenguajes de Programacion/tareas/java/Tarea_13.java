/* 
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: Busqeuda de numero en un vector
 */
 
import javax.swing.JOptionPane;
public class Tarea_13{
	public static void main(String[] arg){
		int i, size, num, contador, arreglo[];
		String entrada, vector;
		
		entrada = JOptionPane.showInputDialog("Ingrese tama\u00F1o del vector:");
		size = Integer.parseInt(entrada);
		
		arreglo = new int[size];
		vector = "[";
		
		for (i=0; i<size; i++){
			entrada = JOptionPane.showInputDialog("Ingrese un numero");
			arreglo[i]=Integer.parseInt(entrada);
			
			vector += arreglo[i] + ", ";
		}
		
		vector += "]";
		
		entrada = JOptionPane.showInputDialog("Ingrese numero a buscar:");
		num = Integer.parseInt(entrada);
		
		contador = 0;
		
		for (i=0; i<size; i++){
			if(arreglo[i] == num){
				contador++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Vector = " + vector +
		"\n\rBusqueda: " + num + "\n\rSu busqueda existe " + contador +" veces en el vector.");
	}
}