inventario = ["manzanas","platanos","naranjas","peras"]
#Añadimos uvas y kiwis al final de la lista
inventario.append("kiwis")
inventario.append("uvas")
#añadimos melon como conjunto separado y luego unida al inventario
melon = ["melon"]
inventario.extend(melon)
#Por error de etiquetado "platanos" deben ir despues de "manzanas" y llamarse "platanos frescos"
inventario.pop(1) 
inventario.insert(1,"platanos frescos")
#Creamos un array de reporte de emergencia que contenga los 4 primeros elementos del inventario
reporte_urgente = inventario[0:4]
#Mostramos con for reporte_urgente
for i in reporte_urgente:
    print("Indice " + str(reporte_urgente.index(i)) + ": " + i)