def suma(a, b):
        return a + b
def resta(a, b):
    return a - b
def multiplicacion(a, b):
    return a * b
def division(a, b):
    if b != 0:
        return a / b
    else:
        return "Error: División por cero"
def potencia(a, b):
    return a ** b
def factorial(n):
    if n < 0:
        return "Error: Factorial de número negativo"
    elif n == 0 or n == 1:
        return 1
    else:
        resultado = 1
        for i in range(2, n + 1):
            resultado *= i
        return resultado
while True:
    print("Seleccione la operación:")
    print("1. Suma")
    print("2. Resta")
    print("3. Multiplicación")
    print("4. División")
    print("5. Potencia")
    print("6. Factorial")
    print("7. Salir")
    opcion = input("Ingrese el número de la operación deseada: ")
    if opcion == '7':
        print("Saliendo de la calculadora.")
        break
    if opcion in ['1', '2', '3', '4', '5']:
        num1 = float(input("Ingrese el primer número: "))
        num2 = float(input("Ingrese el segundo número: "))
        if opcion == '1':
            print(f"Resultado: {suma(num1, num2)}")
        elif opcion == '2':
            print(f"Resultado: {resta(num1, num2)}")
        elif opcion == '3':
            print(f"Resultado: {multiplicacion(num1, num2)}")
        elif opcion == '4':
            print(f"Resultado: {division(num1, num2)}")
        elif opcion == '5':
            print(f"Resultado: {potencia(num1, num2)}")
    elif opcion == '6':
        num = int(input("Ingrese un número entero no negativo: "))
        print(f"Resultado: {factorial(num)}")
    else:
        print("Opción no válida. Por favor, intente de nuevo.")
