=begin
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: Busqueda en Matriz
=end

print("ingrese el total de filas: ")
n=gets().to_i

print("ingrese el total de columnas: ")
m=gets().to_i

a= Array.new(n){Array.new(m)}
		
for i in (0...n)
  for j in (0...m)
      print("ingrese un numero de la posicion: " + (i+1).to_s + " " + (j+1).to_s + " :")
      a[i][j]=gets().to_i
  end
end

print("ingrese el valor a buscar: ")
b=gets().to_i
c = 0;

for i in (0...n)
  for j in (0...m)
    if(b == a[i][j]) then
      c = c + 1;
    end
  end
end
print("El valor que esta buscando es el: " + b.to_s + " y se encuentra " + c.to_s +  " veces en la matriz");
print("\n\n");

letrero= " "
for i in (0...n)
  for j in (0...m)
    letrero= letrero + a[i][j].to_s + " "
  end
  letrero= letrero + "\n"
end
puts(letrero)
