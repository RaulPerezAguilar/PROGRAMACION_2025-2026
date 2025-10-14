n = float(input("Introduce un número decimal: "))
if n < 0:
    n = abs(n) # Convertimos a positivo si es negativo con abs() que devuelve el valor absoluto de un numero
    redondeado = round(n)
    print(f"El número {n} redondeado es {redondeado}")
else:
    redondeado = round(n)
    print(f"El número {n} redondeado es {redondeado}")