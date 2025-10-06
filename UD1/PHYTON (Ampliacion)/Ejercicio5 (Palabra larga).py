print ("Dime una palabra: ")
palabra = input()
longitud = len(palabra)
print ("Dime otra palabra: ")
palabra2 = input()
longitud2 = len(palabra2)
match (longitud, longitud2):
    case (x,y) if x > y:
        print(f"La palabra mas larga es: {palabra}")
    case (x,y) if x < y:
        print(f"La palabra mas larga es: {palabra2}")
    case (x,y) if x == y:
        print("Las dos palabras tienen la misma longitud")