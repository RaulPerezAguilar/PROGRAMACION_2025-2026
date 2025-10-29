print ("¿Que accion quieres realizar?")
print ("suma")
print ("resta")
print ("multiplicacion")
print ("division")
print ("raiz")
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
elif accion == "raiz":
    print ("Introduce el numero:")
    num = float(input())
    if num < 0: #Comprobamos que el numero no sea negativo
        print ("No se puede calcular la raiz de un numero negativo")
    else:
        resultado = num * 0.5 #multiplicamos por 0.5 para calcular la raiz cuadrada ya que es lo mismo que elevar a 1/2
        print ("La raiz es: " + str(resultado))
else:
    print ("Accion no valida") 