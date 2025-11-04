precios = [12.50, 45.99, 5.00, 22.75, 10.00]
for i in precios:
    print("El precio es: " + str(i))
for i in range(len(precios)):
    print(f"El precio en la posición {i} es: {precios[i]}")
suma = 0
for i in precios:
    suma += i
print(f"La suma total de los precios es: {suma}")