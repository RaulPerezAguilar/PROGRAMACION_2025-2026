precios = [12.50, 45.99, 5.00, 22.75, 10.00]
for i in precios:
    print(i)
for i in range(len(precios)):
    print(i,precios[i])
suma = 0
for i in precios:
    suma += i
print(suma)