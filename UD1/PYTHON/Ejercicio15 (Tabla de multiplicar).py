print("De que numero quieres la tabla de multiplicar (0 para salir): ")
while True:
    n = int(input())
    if n != 0:
        for i in range(1,11):
            print(str(n) + " x " + str(i) + " = " + str(n * i))
        print("¿Que tabla de multiplicar quieres ahora? (0 para salir): ")
    else:
        print("Saliendo...")
        break