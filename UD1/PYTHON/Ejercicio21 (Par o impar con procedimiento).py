#programa que a traves de un procedimiento determine si un numero es par o impar
def par_impar(n): 
    if n % 2 == 0:
        print("El numero es par")
    else:
        print("El numero es impar")
#Solicitamos al usuario que ingrese un numero
n = int(input("Ingrese un numero: "))
#Invocamos el procedimiento
par_impar(n)