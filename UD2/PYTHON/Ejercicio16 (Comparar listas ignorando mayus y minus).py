a = [1,2,3]
b = [1,2,3]
c = [1,2,4]
d = [1,2]

def comparar_listas(lista1, lista2):
    for i in range(len(lista1)):
        if lista1[i] != lista2[i]:
            return False
        else:
            continue
    return True

print(comparar_listas(a,b))  #True
print(comparar_listas(a,c))  #False


#a = a.srot()    #Ordenar listas con .sort() [Modifica el array] y .sorted() [Crea un nuevo array]
#b = a.sorted()

