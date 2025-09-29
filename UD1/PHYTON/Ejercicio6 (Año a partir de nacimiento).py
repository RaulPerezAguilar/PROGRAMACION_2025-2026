print("Introduce tu año de nacimiento: ")
año_nacimiento = int(input())
año_actual = 2025               # Calculamos la edad restando el año actual menos el año de nacimiento
edad = año_actual - año_nacimiento
print("Tienes " + str(edad) + " años.") # Convertimos la edad a cadena para mostrar el resultado