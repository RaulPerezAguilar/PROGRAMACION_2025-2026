def contar (texto):
    contador = 0
    for x in texto:
        if x in "aeiouAEIOU":
            contador += 1
    return contador

def reemplazar (cadena):
    nueva_cadena = ""
    for x in cadena:
        if x in "aeiouAEIOU":
            nueva_cadena += "x"
        else:
            nueva_cadena += x
    return nueva_cadena

frase = input("Introduce una frase: ")
print("Número de vocales:", contar(frase))
print("Frase modificada:", reemplazar(frase))
# Ejercicio 24 (Cuenta vocales)