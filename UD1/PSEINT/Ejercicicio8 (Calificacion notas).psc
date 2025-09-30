Algoritmo Ejercicio8
	Mostrar "Introduce una nota del 0 al 10"
	Leer nota
	
	Si nota >= 0 y nota < 5 Entonces
		Mostrar "Insuficiente"
	Sino Si nota = 5 Entonces
			Mostrar "Suficiente"
		Sino Si nota = 6 Entonces
				Mostrar "Bien"
			Sino Si nota >= 7 y nota <= 8 Entonces
					Mostrar "Notable"
				Sino Si nota >= 9 y nota <= 10 Entonces
						Mostrar "Sobresaliente"
					Sino
						Mostrar "Nota fuera de rango"
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
