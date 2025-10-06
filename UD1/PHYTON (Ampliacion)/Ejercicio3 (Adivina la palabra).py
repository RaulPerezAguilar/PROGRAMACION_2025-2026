print ("Adivina la palabra secreta")
palabra = "python"
while True:
    print("Introduce la palabra: ")
    intento = input()
    if intento == palabra:
        print("Has acertado")
        break
    else:
        print("Intentalo de nuevo")