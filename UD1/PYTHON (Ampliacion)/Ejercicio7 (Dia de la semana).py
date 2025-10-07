while True:
    print ("Introduce un numero del 1 al 7: ")
    num1 = int(input())
    match num1:
        case 1:
            print("Lunes")
        case 2:
            print("Martes")
        case 3:
            print("Miercoles")
        case 4:
            print("Jueves")
        case 5:
            print("Viernes")
        case 6:
            print("Sabado")
        case 7:
            print("Domingo")
        case _:
            print("Numero incorrecto")

