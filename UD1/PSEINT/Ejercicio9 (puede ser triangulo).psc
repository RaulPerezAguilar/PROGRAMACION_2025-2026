Algoritmo Ejercicio9
	Mostrar "Introduce el primer lado"
	Leer lado1
	Mostrar "Introduce el segundo lado"
	Leer lado2
	Mostrar "Introduce el tercer lado"
	Leer lado3
	
	Si (lado1 + lado2 > lado3) Y (lado1 + lado3 > lado2) Y (lado2 + lado3 > lado1) Entonces
		Mostrar "S� puede ser un tri�ngulo"
		Si lado1 = lado2 Y lado2 = lado3 Entonces
			Mostrar "Tri�ngulo equil�tero"
		Sino Si lado1 = lado2 O lado1 = lado3 O lado2 = lado3 Entonces
				Mostrar "Tri�ngulo is�sceles"
			Sino
				Mostrar "Tri�ngulo escaleno"
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
