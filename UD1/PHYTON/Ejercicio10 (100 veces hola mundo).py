print ("Cuantas veces quieres que escriba Hola Mundo: ")
usuario = int(input())
numero = 0
while True:
    if numero == usuario:
        break
    else:
        numero = numero + 1
        print(str(numero) + " Hola Mundo")
        