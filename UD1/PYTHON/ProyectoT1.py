
#vamos a hacer un programa sobre la vida de fran
#vamos haciendo una función 

def bicicleta():#esto es una función 
    print("Fran pilla la bici...")
    n = input("¿Lleva casco?").lower()
    if n == "si":#esto es una condición 
        print("va seguro")
    else:
        print("se va a hacer un chichon")

def comer():
    print("En el menu hay: ")
    print("Abichuela")
    print("Lenteja")
    print("Potaje")
    opcion = input("Que le apetece comer a Fran: ").lower()
    if opcion == "abichuela": #este es una comparación
        print("Fran se comio un plato de abichuelas")
    elif opcion == "lentejas":
        print("Fran se comio un plato de abichuelas")
    elif opcion == "potaje":
        print("Fran se comio un plato de abichuelas")
        
def gritar():
    n = input("¿Que va a gritar fran?") #hacemos que una frase este en mayusculas
    m = n.upper()
    print("¡¡",m,"!!")

def acostarse():
    print("Fran va a contar ovejas")
    t = range(1,5)
    for n in t:					#hacemos un for para contar ovejas
      print("Fran a contado ",n," ovejas")
    print("Fran se durmió")

def mates():
    print("Fran sabe sumar y restar")
    k = input("Que operacion va a hacer Fran: ").lower()
    if k == "sumar":
        n1 = int(input("Introduce un numero: "))
        n2 = int(input("Introduce otro numero: "))
        n3 = n1 + n2									#hacemos una calculadora con sumar y restar
        print(n3)
    elif k == "restar":
        n1 = int(input("Introduce un numero: "))
        n2 = int(input("Introduce otro numero: "))
        n3 = n1 - n2
        print(n3)
    else:
        print("Solo sabe sumar y restar")
    
while True:
    print("Fran puede, bicicleta, comer, gritar, acostarse, mates, nada")
    y = input("Que va a hacer fran:").lower()
    match y:
        case "bicicleta":
            bicicleta()
        case "comer":
            comer()
        case "gritar": 					#bucle para ver que hace fran en cada caso
            gritar()
        case "acostarse":
            acostarse()
            break
        case "mates":
            mates()
        case "nada":
            break