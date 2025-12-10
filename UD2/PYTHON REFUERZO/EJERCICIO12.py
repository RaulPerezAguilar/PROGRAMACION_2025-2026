a = [["a", "b", "c"], 
     ["d", "e", "f"], 
     ["g", "h", "i"]]

# imprimir en una linea
for i in a:
    for m in i:
        print(m, end=" ")
# imprimir en varias lineas
for i in a:
    for m in i:
        print(m)
# imprimir el centro
print(a[1][1])
# cambiar el centro
a[1][1] = "X"