Algoritmo Ejercicio2
	usuario <- "raul"
	Repetir
		Escribir "Usuario: "
		Leer  introducido
		si introducido == usuario
			Escribir "login correcto"
		SiNo
			Escribir "login incorrecto, prueba de nuevo"
		FinSi
	Hasta Que introducido == usuario
	Escribir "Bienvenido " + usuario
FinAlgoritmo
