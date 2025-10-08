suma=1
n=int(input("Introduce un numero para calcular su factorial: "))
for i in range(n,0,-1): 
    suma*=i 
print("El factorial de " + str(n) + " es : " + str(suma))