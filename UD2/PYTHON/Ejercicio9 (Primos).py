num = [1,2,3,4,5,6,7,8,9,10]
primos = []
for i in num:
    primo = True
    for j in range(2, i): 
        if i % j == 0:
            primo = False
            break
    if primo and i > 1:
        primos.append(i)
print("Numeros primos:", primos)