/* 
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: Busqueda en Matriz
 */
 
import javax.swing.JOptionPane;

public class Tarea_14{
	public static void main(String[] arg){
		int row, col, num, filas, columnas, contador, arreglo[][];
		String entrada, Matriz;
		
		entrada = JOptionPane.showInputDialog("Ingrese cantidad de filas de la matriz");
		filas = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Ingrese cantidad de columnas de la matriz");
		columnas = Integer.parseInt(entrada);
		
		arreglo = new int[filas][columnas];
		Matriz = "Matriz = ["+filas+"] ["+columnas+"]\n";
		
		for (row=0 ;row<filas; row++){
			for (col=0; col<columnas; col++){
				entrada = JOptionPane.showInputDialog("Ingrese un numero");
				arreglo[row][col] = Integer.parseInt(entrada);

				Matriz += arreglo[row][col]+", ";
			}
			Matriz += "\n";
		}
		entrada=JOptionPane.showInputDialog("Ingrese numero a buscar");
		num = Integer.parseInt(entrada);
		
		contador = 0;
		
		for(row=0; row<filas; row++){
			for(col=0; col<columnas; col++){
				if (arreglo[row][col] == num){
					contador++;
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, Matriz +
		"\n\rBusqueda: " + num + "\n\rSu busqueda existe " + contador +" veces en la matriz.");
	}
}