m = [["a", "b", "c"], ["d", "e", "f"], ["g", "h", "i"]]
#Imprimimos a d g b e h c f i con while
fila = 0
columna = 0 
while columna < len(m[0]): #Mientras la columna sea menor que el numero de columnas por fila, esto sirve para hacer que el bucle recorra todas las columnas
    fila = 0
    while fila < len(m):
        print(m[fila][columna], end=' ') #Imprimimos el elemento en la posicion fila,columna, añadimos end=' ' para que no haga salto de linea
        fila += 1 #Incrementamos la fila para pasar a la siguiente fila
    columna += 1 #Incrementamos la columna para pasar a la siguiente columna
