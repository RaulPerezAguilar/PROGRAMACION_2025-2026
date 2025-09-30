Algoritmo Ejercicio6
	Definir anoactual Como Entero
	Definir anonacimieto Como Entero
	Definir anos Como Entero
	Escribir "Introduce tu año de nacimiento"
	Leer anonacimieto
	Escribir "Introduce año actual"
	Leer anoactual
	anos <- anoactual-anonacimieto
	Si anos>=18 Entonces
		Escribir "Es mayor de edad"
	SiNo
		Escribir "Es menor de edad"
	Fin Si
FinAlgoritmo
