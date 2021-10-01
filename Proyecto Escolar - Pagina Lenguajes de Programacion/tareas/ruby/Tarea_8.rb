=begin
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: Convierte de Celsius a Fahrenheit y viceversa
=end

puts("¿Que conversion quieres realizar?") 
puts("0.- Celsius a Fahrenheit\n1.- Fahrenheit a Celsius")
print("\nSeleccione una opcion: ")
eleccion = gets().to_i 

case eleccion 
	when 0
		print("Ingrese los grados Celsius: ")
		celsius = gets().to_i
		fahrenheit =(celsius * (9/5)) + 32;
		print(celsius.to_s + "°C equivalen a " + fahrenheit.to_s + "°F")# .to_s convierte a String#
	when 1
		print("Ingrese los grados Fahrenheit: ")
		fahrenheit = gets().to_i
		celsius = (fahrenheit - 32) * (5/9);
		print(fahrenheit.to_s + "°F equivalen a " + celsius.to_s + "°C")		
	else
		print("Opción invalida")
end 
	