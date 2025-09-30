print("Intruce un numero:")
num1 = int(input())
print("Intruce otro numero:")
num2 = int(input())
if num1 > num2:    #Comparamos los numeros para saber cual es mayor
    print("El numero mayor es: " + str(num1))
elif num1 < num2:
    print("El numero mayor es: " + str(num2))
else:
    print("Los numeros son iguales")