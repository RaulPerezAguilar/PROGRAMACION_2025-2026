# CREAR MATRIZ (LISTA DE LISTAS) QUE REPRESENTE EL INVENTARIO
a = [
    ["SGJ11","SGJPAN1",4],
    ["SGJ12","SGJLECHE2",2],
    ["SGJ13","SGJPIPAS3",3],
    ["SGJ14","SGJKIWI4",4],
    ["SGJ15","SGJKIKOS5",5]
]

# BUSQUEDA POR ID
def buscar_id(a, prodId):
    for fila in a:
        if fila[0] == prodId:
            print(f"Producto: {fila[1]}, Stock: {fila[2]}")
            return
        else:
            continue
    print("\033[31mID no encontrado\033[0m")  # Mensaje rojo

# STOCK MAS ALTO Y MAS BAJO
def alto_bajo(a):
    bajo = a[0]   # Primer elemento como referencia
    alto = a[0]

    for fila in a:
        if fila[2] < bajo[2]:
            bajo = fila
        if fila[2] > alto[2]:
            alto = fila

    print(f"Stock más bajo → Producto: {bajo[1]}, Stock: {bajo[2]}")
    print(f"Stock más alto → Producto: {alto[1]}, Stock: {alto[2]}")

#COMPROBACION DEL NOMBRE
def comprobacion(a):
    for fila in a:
        nombre = fila[1]

        mayus = nombre[0].isupper()

        numero = (r"\d", nombre)

        longitud = 5 <= len(nombre) <= 20

        if mayus and numero and longitud:
            print(f"\033[32m{nombre}: BIEN \033[0m")
        else:
            print(f"\033[31m{nombre}: MAL \033[0m")

n = input("Ingrese ID: ")
buscar_id(a, n)
alto_bajo(a)
comprobacion(a)

