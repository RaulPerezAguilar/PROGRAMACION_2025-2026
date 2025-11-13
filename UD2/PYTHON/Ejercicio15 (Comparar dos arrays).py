Array1 = [1,2,3,4,5]
Array2 = [1,2,3,4,5]
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
for e in Array1:
    if e not in Array2:
        print("Los arrays tienen diferentes valores")
        break
#Tienen los mismos valores peron en diferente orden?
for e in Array1:
    if e in Array2:
        continue
    else:
        print("Los arrays tienen diferentes valores")
        break