numeros = [1,2,3,4,5,6,7,8,9,10]
n = int(input("Introduce un número del 1 al 10: "))
if n in numeros:
    print("El numero esta en la posicon", numeros.index(n)) #Si el número está en la lista, muestra su posición
else:
    print("El número no se encuentra en la lista.")

numeros2 = [11,12,13,14,15,16,17,18,19,20]
m = int(input("Añade un numero al array: "))
numeros2.append(m)
if m in numeros2:
    print("El numero esta en la posicon", numeros2.index(m)) #Si el número está en la lista, muestra su posición
else:
    print("El número no se encuentra en la lista.")