=begin
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: Busqueda en vector
=end

print("Ingrese el tamaño del vector ")
n=gets().to_i

array = Array.new(n)
mensaje="["
numero=""

for i in 1..n
  if numero == "" then
    print("Ingrese un numero ")
    numero=gets().to_i
    array[i]=numero
    mensaje+=numero.to_s+" "
  else
    print("Ingrese otro numero ")
    numero=gets().to_i
    array[i]=numero
    mensaje+=numero.to_s+" "
  end 
end 
mensaje+="]"

print("Ingresa el número que deseas buscar en el vector ")
buscar=gets().to_i

veces=0
for i in  (1..array.length)
  if array[i] == buscar then
    veces+=1
  end 
end 

print("El resultado del vector es de: "+mensaje.to_s+
"\nEl número que se busco fue el: "+buscar.to_s+
"\nLas veces que se repitio en el vector fue: "+veces.to_s)
