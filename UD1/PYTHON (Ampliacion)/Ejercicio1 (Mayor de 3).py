print ("Introduce un numero: ")
num1 = int(input())
print ("Introduce otro numero: ")
num2 = int(input())
print ("Introduce otro numero mas: ")
num3 = int(input())
match (num1, num2, num3):
    case (x,y,z) if x >= y >= z:
        print(f"El mayor es: {x}")
    case (x,z,y) if x >= z >= y:
        print(f"El mayor es: {x}")
    case (y,x,z) if y >= x >= z:
        print(f"El mayor es: {y}")