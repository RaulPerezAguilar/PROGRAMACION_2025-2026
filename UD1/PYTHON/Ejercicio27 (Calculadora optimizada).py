def PedirNums():
    n1 = float(input("Introduce el primer número: "))
    n2 = float(input("Introduce el segundo número: "))
    return n1, n2

def suma(n1, n2):
    return n1 + n2

def resta(n1, n2):
    return n1 - n2

def multiplicacion(n1, n2):
    return n1 * n2

def division(n1, n2):
    if n2 != 0:
        return n1 / n2
    else:
        return "Error: División por cero"


while True:
    print("Calculadora básica")
    print("Operaciones disponibles: suma, resta, multiplicacion, division")
    n = input("¿Que operacion quieres hacer?(Salir para terminar) ")
    
    match n:
        case "suma":
            print("El resultado de la suma es:", suma)
        case "resta":
            print("El resultado de la resta es:", resta)
        case "multiplicacion":
            print("El resultado de la multiplicacion es:", multiplicacion)
        case "division":
            print("El resultado de la division es:", division)
        case "Salir":
            break