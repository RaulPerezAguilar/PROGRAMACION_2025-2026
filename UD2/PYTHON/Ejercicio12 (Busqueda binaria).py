array = [0,10,20,30,40,50,60,70,80,90]

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

print("Array:", array)
n = int(input("Introduce un numero a buscar: "))
print("El numero se encuentra en la posicion:", busqueda_binaria(array, n))
