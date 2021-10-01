=begin
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: Imprime primeros N elementos de la Serie: 1, 8, 243, 16384, 1953125...
=end

print("Ingrese el total de numeros elementos: ")
n=gets().to_i

serie = 0
mensaje=""
for i in 1..n
  serie=i**(2*i-1)
  mensaje += sucesion.to_s+","
end 
print("La sucesión es " + mensaje)
