Algoritmo Ejercicio9
	Mostrar "Introduce el primer lado"
	Leer lado1
	Mostrar "Introduce el segundo lado"
	Leer lado2
	Mostrar "Introduce el tercer lado"
	Leer lado3
	
	Si (lado1 + lado2 > lado3) Y (lado1 + lado3 > lado2) Y (lado2 + lado3 > lado1) Entonces
		Mostrar "Sí puede ser un triángulo"
		Si lado1 = lado2 Y lado2 = lado3 Entonces
			Mostrar "Triángulo equilátero"
		Sino Si lado1 = lado2 O lado1 = lado3 O lado2 = lado3 Entonces
				Mostrar "Triángulo isósceles"
			Sino
				Mostrar "Triángulo escaleno"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
