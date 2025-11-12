#Invocar array con elementos desordenados. Invoca la funcion de busqueda secuencial y luego la de busqueda binaria
import random

array = random.sample(range(0, 100), 10)  # Array con 10 numeros aleatorios entre 0 y 99
array_ordenado = sorted(array)  # Ordenar el array para busqueda binaria
def busqueda_secuencial(array, n):
    for i in range(len(array)):
        if array[i] == n:
            return i
    return -1
def busqueda_binaria(array, n):
    i = 0
    j = len(array) - 1
    while i <= j:
        medio = (i + j) // 2 # Calcular el indice del elemento medio
        if array[medio] == n: # Si el elemento medio es el objetivo, devolver su indice
            return medio 
        elif array[medio] < n: # Si el objetivo es mayor, buscar en la mitad derecha
            i = medio + 1
        else:
            j = medio - 1 # Si el objetivo es menor, buscar en la mitad izquierda
    return -1
print("Array desordenado:", array)
n = int(input("Introduce un numero a buscar: "))
print("Busqueda secuencial: El numero se encuentra en la posicion:", busqueda_secuencial(array, n))
print("Array ordenado para busqueda binaria:", array_ordenado)