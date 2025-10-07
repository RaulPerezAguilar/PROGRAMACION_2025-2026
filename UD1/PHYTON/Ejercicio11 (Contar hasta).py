numero = 0
while True:
    print ("Hasta que numero quieres contar: ")
    usuario = int(input())
    if usuario >= 0:
        if numero == usuario:
            break
        else: 
            numero = numero + 1
            print (numero)
    else:
        print ("El numero debe ser mayor que 0")