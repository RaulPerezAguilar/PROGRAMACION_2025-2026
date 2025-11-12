Array1 = [1,2,3,4,5]
Array2 = [1,2,3,4,5,6]
#Son iguales?
if Array1 == Array2:
    print("Los arrays son iguales")
else:
    print("Los arrays son diferentes")
#Tienen la misma longitud?
if len(Array1) == len(Array2):
    print("Los arrays tienen la misma longitud")
else:
    print("Los arrays tienen diferente longitud")
#Tienen diferentes valores?
if set(Array1) != set(Array2):
    print("Los arrays tienen diferentes valores")
else:
    print("Los arrays tienen los mismos valores")
#Tienen los mismos valores peron en diferente orden?
if sorted(Array1) == sorted(Array2):
    print("Los arrays tienen los mismos valores pero en diferente orden")
else:
    print("Los arrays tienen diferentes valores")