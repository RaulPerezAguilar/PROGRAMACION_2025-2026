#for normal
suma = 0
Array = [25, 12, 30, 10, 8]

for i in range(len(Array)):
    suma += Array[i]
print(suma)

#for each
suma2=0
Array2 = [25,12,30,10,8]
for i in Array2:
    suma2 += i
print(suma2)

#while
suma3=0
i=0
Array3= [25,12,30,10,8]
longitud = len(Array3)
while i < longitud:
    suma3 += Array3[i]
    i += 1
print(suma3)
