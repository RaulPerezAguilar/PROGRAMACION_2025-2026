print ("Dame tres numeros")
print ("Numero 1: ")
num1 = int(input())
print ("Numero 2: ")
num2 = int(input())
print ("Numero 3: ")
num3 = int(input())
match (num1, num2, num3):
    case (x, y, z) if x <= y <= z:
        print(f"Los numeros ordenados son: {x}, {y}, {z}")
    case (x, z, y) if x <= z <= y:
        print(f"Los numeros ordenados son: {x}, {z}, {y}")
    case (y, x, z) if y <= x <= z:
        print(f"Los numeros ordenados son: {y}, {x}, {z}")
    case (y, z, x) if y <= z <= x:
        print(f"Los numeros ordenados son: {y}, {z}, {x}")
    case (z, x, y) if z <= x <= y:
        print(f"Los numeros ordenados son: {z}, {x}, {y}")
    case (z, y, x) if z <= y <= x:
        print(f"Los numeros ordenados son: {z}, {y}, {x}")