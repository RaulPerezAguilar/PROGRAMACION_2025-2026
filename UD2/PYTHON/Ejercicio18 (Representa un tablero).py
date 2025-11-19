#Escribe un codigo para declarar e inicializar esta matriz como lista anidada
#Accede e imprime el valor que se enuentra en la posicion
#fila 1, columna 2
#el elemento central (numero 5)
tablero = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
print("Elemento en fila 1, columna 2:", tablero[1][2])  # Imprime 6
print("Elemento central (5):", tablero[1][1])  # Imprime 5
#Escribe un bucle para que recorra solo la segunda fila e imprima sus elementos
print("Elementos de la segunda fila:")
for elemento in tablero[1]:
    print(elemento)
#Escribe un bucle anidado que recorra toda la matriz e imprima todos sus elementos, separados por espacios en la misma linea para simular la matriz visualmente
print("Elementos de la matriz:")
for fila in tablero:
    for elemento in fila:
        print(elemento, end=' ')
    print()  # Nueva línea después de cada fila
#Recorre la matriz y ve extrayendo los numeros multiplos de 2 a otra matriz en su misma posicion
m = [[1,2,3],[4,5,6],[7,8,9]]
m2 = [[0,0,0],[0,0,0],[0,0,0]]
for fila in range(len(m)):
    for j in range(len(m[fila])):
        if m[fila][j] % 2 == 0:
            m2[fila][j] = m[fila][j]
            m[fila][j] = 0

print("m:")
for fila in m:
    for elemento in fila:
        print(elemento, end=' ')
    print()

print("m2:")
for fila in m2:
    for elemento in fila:
        print(elemento, end=' ')
    print()