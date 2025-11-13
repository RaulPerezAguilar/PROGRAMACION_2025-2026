#Crear Array
Array1 = [1, 2, 3, 4, 5]

#Copia con el método copy()
copia1 = Array1.copy()  # Crear una copia superficial de Array1

#Copia con recorte (Slice)
copia2 = Array1.Slice(1, 4)  # Crear un recorte de Array1 desde el índice 1 hasta el 3

#Crear copia manual
copia3 = []
for i in Array1:
    copia3.append(i)


#Asignar array origianal a variable copia4 ¿Que pasa si eliminas el ultimo elemto de copia 4? ¿y si eliminas el primer elemento de copia3?
copia4 = Array1  # Asignar la referencia de Array1 a copia4
copia4.pop()  # Eliminar el último elemento de copia4
print("Array1 después de modificar copia4:", Array1)  # Array1 también se verá afectado

#Compara los 4 arrays usando el algoritmo dle ejercicio 17
def comparar_listas(lista1, lista2):
    for i in range(len(lista1)):
        if lista1[i] != lista2[i]:
            return False
        else:
            continue
    return True

print("Comparación entre Array1 y copia1:", comparar_listas(Array1, copia1))  #True
print("Comparación entre Array1 y copia2:", comparar_listas(Array1, copia2))  #False
print("Comparación entre Array1 y copia3:", comparar_listas(Array1, copia3))  #True
print("Comparación entre Array1 y copia4:", comparar_listas(Array1, copia4))  #True