=begin
 * Alumno: Brandon Jahir Rojas Quintanilla
 * Matricula: 1635448
 * Hora: N2
 * Salón: 4201
 * Función: Suma de Matrices
=end

print("ingrese el valor de la fila: ")
n1=gets().to_i

print("ingrese el valor de la columna: ")
m1=gets().to_i



a= Array.new(n1){Array.new(m1)}

b= Array.new(n1){Array.new(m1)}

if ( n1 == m1) then
		
	print("LLENADO E IMPRIMIENDO LA PRIMERA MATRIZ\n");
		for i in (0...n1)
				for j in (0...m1)
						print("ingrese un numero de la posicion: " + (i+1).to_s + " " + (j+1).to_s + " :")
						a[i][j]=gets().to_i
				end
		end	

	letrero= " "
	for i in (0...n1)
				for j in (0...m1)
						letrero= letrero + a[i][j].to_s + " "

				end
			letrero= letrero + "\n"
		end
		puts(letrero)

	print("\nLLENANDO E IMPRIMIENDO LA SEGUNDA MATRIZ\n");
	for i in (0...n1)
				for j in (0...m1)
						print("ingrese un numero de la posicion: " + (i+1).to_s + " " + (j+1).to_s + " :")
						b[i][j]=gets().to_i
				end
		end	

	letrero= " "
	for i in (0...n1)
				for j in (0...m1)
						letrero= letrero + b[i][j].to_s + " "

				end
			letrero= letrero + "\n"
		end
		puts(letrero)

	print("\nSUAMANDO LAS MATRICES\n");

c = Array.new(n1){Array.new(m1)}

	for i in (0...n1)
		for j in (0...m1)
			c[i][j] = a[i][j] + b[i][j];
		end
	end
		letrero= " "
	for i in (0...n1)
				for j in (0...m1)
						letrero= letrero + c[i][j].to_s + " "

				end
			letrero= letrero + "\n"
		end
		puts(letrero)
			
else 
	print(" Las matrices no coinciden ");
end
