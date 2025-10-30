def mayor_numero(Array):
    mayor = Array[0]
    for numero in Array:
        if numero > mayor:
            mayor = numero
    return mayor

Array = [1,2,3,4,5,6,7,8,9,10]
resultado = mayor_numero(Array)
print("El mayor numero del array es:", resultado)
