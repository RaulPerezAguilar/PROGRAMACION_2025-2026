n = str(input("Introduce una frase: "))
vocales = "aeiouAEIOU"
contador = 0
for char in n: 
    if char in vocales:
        contador += 1
print(f"La frase tiene {contador} vocales.")
#si es vocal cambiarla por x e ipmprimir la nueva frase
nueva_frase = ""
for char in n:
    if char in vocales:
        nueva_frase += "x"
    else:
        nueva_frase += char
print("La nueva frase es:", nueva_frase)
