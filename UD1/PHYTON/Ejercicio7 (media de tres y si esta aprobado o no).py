print("Introduce la primera nota (1-10):")
nota1 = float(input())
print("Introduce la segunda nota (1-10):")
nota2 = float(input())
print("Introduce la tercera nota (1-10):")
nota3 = float(input())
media = (nota1 + nota2 + nota3) / 3
print("La media de las tres notas es: " + str(media))
if media >= 5:
    print("Has aprobado")
else:
    print("No has aprobado")