print ("Introduce un numero: ")
num1 = int(input())
match num1:
    case x if x > 0:
        print("El numero es positivo")
    case x if x < 0:
        print("El numero es negativo")
    case 0:
        print("El numero es 0")