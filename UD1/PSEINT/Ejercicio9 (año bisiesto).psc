Algoritmo Ejercicio9
	Definir año Como Entero
    Escribir "Introduce un año:"
    Leer año
    Si (año % 4 == 0 Y año % 100 <> 0) O (año % 400 == 0) Entonces
        Escribir " es año bisiesto"
    Sino
        Escribir " no es año bisiesto"
    Fin Si
FinAlgoritmo
