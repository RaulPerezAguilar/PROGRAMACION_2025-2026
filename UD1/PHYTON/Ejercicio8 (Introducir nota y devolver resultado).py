print("Introduce una nota del 0 al 10")
nota = float(input("Nota: ")) # Solicitar la nota y convertir a float
if 0 <= nota < 5:
    print("Insuficiente")
elif nota == 5:
    print("Suficiente")
elif nota == 6:                 # elif en lugar de if para evitar evaluar todas las condiciones
    print("Bien")
elif 7 <= nota <= 8:
    print("Notable")
elif 9 <= nota <= 10:
    print("Sobresaliente")
else:
    print("Nota fuera de rango")