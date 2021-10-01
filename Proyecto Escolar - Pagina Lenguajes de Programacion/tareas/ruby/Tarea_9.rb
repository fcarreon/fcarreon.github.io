=begin
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: convierte pesos a dolar, euro, yen y dolar de hong kong
=end

puts("¿Que conversión desa realizar? Selecciona una opción...")
print("\n1.- Pesos a Dolares\n2.- Pesos a Euros\n3.- Pesos a Yen \n4.- Pesos a Dolares (Hong Kong) ")
opcion=gets().to_i


dolar=18.80
euro=22.95
yen=0.1725
dolarh=0.41685

case opcion
  when 1
    print("Ingrese cantidad de pesos: ")
    pesos=gets().to_i
    conversion=pesos/dolar
    if (conversion >=0)
      print("La conversión de pesos a dolar fue:\n"+(conversion).round(2).to_s)	
		else 
      print("La opción fue invalida regreso:\n"+(conversion).round(2).to_s)
		end
  when 2
    print("Ingrese cantidad de pesos: ")
    pesos=gets().to_i
    conversion=pesos/euro;
    if (conversion >=0)
      print("La conversión de pesos a euros fue:\n"+(conversion).round(2).to_s)
    else 
      print("La opción fue invalida regreso:\n"+(conversion).round(2).to_s)
		end
  when 3
    print("Ingrese cantidad de pesos: ")
    pesos=gets().to_i
    conversion=pesos/yen
    if (conversion >=0)
      print("La conversión de pesos a yen fue:\n"+(conversion).round(2).to_s)
    else 
      print("La opción fue invalida regreso:\n"+(conversion).round(2).to_s)
		end
  when 4
    print("Ingrese cantidad de pesos: ")
    pesos=gets().to_i
    conversion=pesos*dolarh
    if (conversion >=0)
      print("La conversión de pesos a dolares(hong kong) fue:\n"+(conversion).round(2).to_s)
    else 
      print("La opción fue invalida regreso:\n"+(conversion).round(2).to_s)
		end
else 
  print("Opcion invalida")
end 

