print("Introduce tu primer lado del triangulo:")
lado1 = float(input())
print("Introduce tu segundo lado del triangulo:")
lado2 = float(input())
print("Introduce tu tercer lado del triangulo:")
lado3 = float(input())
if (lado1 < lado2 + lado3) and (lado2 < lado1 + lado3) and (lado3 < lado1 + lado2):  # Comprobamos si cumple para ser un triangulo
    print("Si puede ser un triangulo")
    if lado1 == lado2 == lado3: # Comprobamos si es equilatero, isosceles o escaleno
        print("Es un triángulo equilátero")
    elif lado1 == lado2 or lado1 == lado3 or lado2 == lado3:
        print("Es un triángulo isósceles")
    else:
        print("Es un triángulo escaleno")
else:
    print("No puede ser un triangulo")