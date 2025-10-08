suma=0
for i in range(100,0,-1): #el 3er parametro es el paso, en este caso -1 para que vaya restando
    suma+=i # hacemos que suma sea igual a suma mas i para ir acumulando la suma
print("La suma del 100 al 1 es: " + str(suma))