/* 
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: Suma de Matrices
 */
 
import javax.swing.JOptionPane;
public class Tarea_15{
	public static void main(String[] arg){
		int row, col, n, filas, columnas;
		int matriz1[][], matriz2[][], suma[][];
		String entrada, mensaje1, mensaje2, mensaje3;
		
		entrada = JOptionPane.showInputDialog("Ingrese cantidad de filas de las matrices");
		filas = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Ingrese cantidad de columnas de las matrices");
		columnas = Integer.parseInt(entrada);
		
		matriz1 = new int [filas][columnas];
		matriz2 = new int [filas][columnas];
		suma = new  int [filas][columnas]; 
		
		mensaje1 = "Matriz 1 = ["+filas+"]x["+columnas+"]\n";
		
		for (row=0 ;row<filas; row++){
			for (col=0; col<columnas; col++){
				entrada = JOptionPane.showInputDialog("Llenado de Matriz 1: Ingrese un numero");
				matriz1[row][col] = Integer.parseInt(entrada);

				mensaje1 += matriz1[row][col]+", ";
			}
			mensaje1 += "\n";
		}
				
		mensaje2 = "Matriz 2 = ["+filas+"]x["+columnas+"]\n";
		for (row=0 ;row<filas; row++){
			for (col=0; col<columnas; col++){
				entrada = JOptionPane.showInputDialog("Llenado de Matriz 2: Ingrese un numero");
				matriz2[row][col] = Integer.parseInt(entrada);

				mensaje2 += matriz2[row][col]+", ";
			}
			mensaje2 += "\n";
		}
		//Se realiza la suma de las dos matrices
		mensaje3 = "\n";
		for (row=0; row<filas; row++){
			for (col=0; col<columnas; col++){
				suma[row][col] = matriz1[row][col] + matriz2[row][col];
				mensaje3 += suma[row][col] + ", ";
			}
			mensaje3 = mensaje3 + "\n";
        }
		JOptionPane.showMessageDialog(null, mensaje1 + "\n\r" + mensaje2 + "\n\rLa suma de matrices es: " + mensaje3);
	}
}