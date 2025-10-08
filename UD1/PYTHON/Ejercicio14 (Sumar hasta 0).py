suma = 0
n = 0
while True:
    print ("Introduce un numero para sumar (0 para salir): ")
    n = int(input())
    if n != 0:
            suma = suma + n
            print ("Llevas acumulado: ", suma)
    else: 
        break