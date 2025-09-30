Algoritmo Ejercicio5
	Definir nota1 Como Real
	Definir nota2 Como Real
	Definir nota3 Como Real
	Definir notatotal Como Real
	Definir notamedia Como Entero
	Escribir  "Introduce la primera nota: "
	Leer nota1
	Escribir  "Introduce la segunda nota: "
	Leer nota2
	Escribir  "Introduce la tercera nota: "
	Leer nota3
	notatotal <- (nota1 + nota2 + nota3) /3
	notamedia <- TRUNC(notatotal)
	Escribir "Tu nota media es ", notamedia 
	// Con la funcion TRUNC quitamos los decimales de un numero, a eso le sumamos 1 ya que de base lo redondea abajo
FinAlgoritmo
