n = str(input("Introduce una frase: "))
vocales = "aeiouAEIOU"
contador = 0
for x in n: 
    if x in vocales:
        contador += 1
print(f"La frase tiene {contador} vocales.")
#si es vocal cambiarla por x e ipmprimir la nueva frase
nueva_frase = ""
for x in n:
    if x in vocales:
        nueva_frase += "x"
    else:
        nueva_frase += x
print("La nueva frase es:", nueva_frase)
