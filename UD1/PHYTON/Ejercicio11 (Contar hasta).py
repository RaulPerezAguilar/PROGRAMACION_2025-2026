print ("Hasta que numero quieres contar: ")
usuario = int(input())
numero = 0
while True:
    if numero == usuario:
        break
    else: 
        numero = numero + 1
        print (numero)