/* 
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: convierte pesos a dolar, euro, yen y dolar de hong kong
 */ 

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Tarea_9{
	public static void main(String[] args) {
		
		String entrada, letrero;
		int i, pesos, eleccion;
		float cambio, dolar, euro, yen, dolarh;
		
		DecimalFormat format = new DecimalFormat();
		format.setMaximumFractionDigits(2); 
		
		dolar = 18.80f; 
		euro = 22.95f;
		yen = 0.1725f;	
		dolarh = 0.41685f;
		
		eleccion = JOptionPane.showOptionDialog(null, "Que conversion desea realizar?", "Cambio de Moneda", JOptionPane.DEFAULT_OPTION, 
			JOptionPane.QUESTION_MESSAGE, null, new String[]{"Pesos a Dolares", "Pesos a Euros", "Pesos a Yen", "Pesos a Dolares (Hong Kong)"}, null);
		
		switch(eleccion) {
			case 0: 
				entrada = JOptionPane.showInputDialog("Ingrese la cantidad de pesos a cambiar");
				pesos = Integer.parseInt(entrada);
				cambio = pesos/dolar;
				
				if (cambio >= 0){
					JOptionPane.showMessageDialog(null,"La conversión de pesos a dolar fue: " + format.format(cambio));
				}
				else {
					JOptionPane.showMessageDialog(null,"La opción fue invalida regreso: " + format.format(cambio));
				}
				break;
			case 1: 
				entrada = JOptionPane.showInputDialog("Ingrese la cantidad de pesos a cambiar");
				pesos = Integer.parseInt(entrada);
				cambio = pesos/euro;
				
				if (cambio >= 0){
					JOptionPane.showMessageDialog(null,"La conversión de pesos a euros fue: " + format.format(cambio));
				}
				else {
					JOptionPane.showMessageDialog(null,"La opción fue invalida regreso: " + format.format(cambio));
				}
				break;
			case 2: 
				entrada = JOptionPane.showInputDialog("Ingrese la cantidad de pesos a cambiar");
				pesos = Integer.parseInt(entrada);
				cambio= pesos/yen;
				
				if (cambio >= 0){
					JOptionPane.showMessageDialog(null,"La conversión de pesos a yen fue: " + format.format(cambio));
				}
				else {
					JOptionPane.showMessageDialog(null,"La opción fue invalida regreso: " + format.format(cambio));
				}
				break;
			case 3: 
				entrada = JOptionPane.showInputDialog("Ingrese la cantidad de pesos a cambiar");
				pesos = Integer.parseInt(entrada);
				cambio= pesos/dolarh;
				
				if (cambio >= 0){
					JOptionPane.showMessageDialog(null,"La conversión de pesos a dolares(hong kong) fue: " + format.format(cambio));
				}
				else {
					JOptionPane.showMessageDialog(null,"La opción fue invalida regreso: " + format.format(cambio));
				}
				break;
			default: JOptionPane.showMessageDialog(null,"Opcion Invalida");
			break;
		}
			
	} //fin main
} //fin clase