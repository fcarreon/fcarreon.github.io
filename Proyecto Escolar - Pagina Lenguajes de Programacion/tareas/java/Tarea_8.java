/* 
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: convierte de grados centigrados a grados fahrenheit y viceversa
 */ 
 
import javax.swing.JOptionPane;
public class Tarea_8{
	public static void main(String[] args) {
		
		String entrada;
		int celsius, eleccion, fahrenheit;
		
		eleccion = JOptionPane.showOptionDialog(null, "Que conversion quieres realizar?", "Temperatura", JOptionPane.DEFAULT_OPTION, 
			JOptionPane.QUESTION_MESSAGE, null, new String[]{"°C a °F", "°F a °C"}, null);
		
		switch(eleccion) {
			case 0: 
				entrada = JOptionPane.showInputDialog("Ingrese los grados Celsius");
				celsius = Integer.parseInt(entrada);
				fahrenheit = (celsius * (9/5)) + 32; 
				JOptionPane.showMessageDialog(null,celsius + "°C equivalen a " + fahrenheit + "°F");
				break;
			case 1: 
				entrada = JOptionPane.showInputDialog("Ingrese los grados Fahrenheit");
				fahrenheit = Integer.parseInt(entrada);
				celsius = (fahrenheit - 32) * (5/9);
				JOptionPane.showMessageDialog(null,fahrenheit +"°F equivalen a "  + celsius + "°C");
				break;
			default: JOptionPane.showMessageDialog(null,"Opcion Invalida");
			break;
		}
			
	} 
} 