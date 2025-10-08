suma=0
for i in range(100,0,-1): #el 3er parametro es el paso, en este caso -1 para que vaya restando
    if i != 1:
        print(str(i) + " + ", end="") # el end="" es para que no haga salto de linea
    else:
        print(str(i) + " = ", end="")
    suma+=i # hacemos que suma sea igual a suma mas i para ir acumulando la suma
print(str(suma))
print("La suma total del 100 al 1 es: " + str(suma))

    