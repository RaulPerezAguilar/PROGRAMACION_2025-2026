print ("Introduce un año:")
year = int(input())
if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0): #Comprobamos si es bisiesto
    print (str(year) + " es año bisiesto")
else:
    print (str(year) + " no es año bisiesto")