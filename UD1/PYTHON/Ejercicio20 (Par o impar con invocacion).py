#Creamos un programa que invoque una funcion que determine si un numero es par o impar
def par_impar(numero): 
    if numero % 2 == 0:
        return "El numero es par"
    else:
        return "El numero es impar"
#Solicitamos al usuario que ingrese un numero
numero = int(input("Ingrese un numero: "))
#Invocamos la funcion y mostramos el resultado
resultado = par_impar(numero)
print(resultado)