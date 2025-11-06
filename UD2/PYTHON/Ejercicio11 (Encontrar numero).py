#Buscar un numero
def buscar():
    if n in numeros:
        return numeros.index(n) #Si el número está en la lista, muestra su posición
    else:
        return "El número no se encuentra en la lista."


numeros = [1,2,3,4,5,6,7,8,9,10]
n = int(input("Introduce un número del 1 al 10: "))
print("El numero esta en la posicion", buscar())


#Añadir un número al array y buscar su posición
n = int(input("Añade un numero al array: "))
numeros.append(n)
print("El numero esta en la posicion", buscar())

#Con un bucle while
while True:
    n = int(input("Introduce un número del 1 al 10 (0 para salir): "))
    if n == 0:
        break
    print("El numero esta en la posicion", buscar())

#Con un bucle for
for i in range(3):  # Permite buscar 3 números
    n = int(input("Introduce un número del 1 al 10: "))
    print("El numero esta en la posicion", buscar())