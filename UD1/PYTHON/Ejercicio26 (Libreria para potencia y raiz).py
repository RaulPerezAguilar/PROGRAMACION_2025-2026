import math

print ("¿Que accion quieres realizar?")
print ("suma")
print ("resta")
print ("multiplicacion")
print ("division")
#salto de linea
print ()
accion = input().lower() #Pasamos a minusculas 
if accion == "suma":
    print ("Introduce el primer numero:")
    num1 = float(input())
    print ("Introduce el segundo numero:")
    num2 = float(input())
    resultado = num1 + num2
    print ("El resultado es: " + str(resultado))
elif accion == "resta":
    print ("Introduce el primer numero:")
    num1 = float(input())
    print ("Introduce el segundo numero:")
    num2 = float(input())
    resultado = num1 - num2
    print ("El resultado es: " + str(resultado))
elif accion == "multiplicacion":
    print ("Introduce el primer numero:")
    num1 = float(input())
    print ("Introduce el segundo numero:")
    num2 = float(input())
    resultado = num1 * num2
    print ("El resultado es: " + str(resultado))
elif accion == "division":
    print ("Introduce el primer numero:")
    num1 = float(input())
    print ("Introduce el segundo numero:")
    num2 = float(input())
    if num2 == 0: #Comprobamos que el segundo numero no sea 0
        print ("No se puede dividir entre 0")
    else:
        resultado = num1 / num2
        print ("El resultado es: " + str(resultado))
elif accion == "potencia":
    print ("Introduce la base:")
    base = float(input())
    print ("Introduce el exponente:")
    exponente = float(input())
    resultado = math.pow(base,exponente)
    print ("El resultado es: " + str(resultado))
elif accion == "raiz":
    print ("Introduce el numero:")
    num = float(input())
    if num < 0: #Comprobamos que el numero no sea negativo
        print ("No se puede calcular la raiz de un numero negativo")
    else:
        resultado = math.sqrt(num)
        print ("El resultado es: " + str(resultado))
else:
    print ("Accion no valida") 