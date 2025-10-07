i = 0
while True:
    print ("Hasta que numero quieres contar: ")
    n = int(input())
    if n >= 0:
        if i == n:
            break
        else: 
            i = i + 1
            print (i)
    else:
        print ("El numero debe ser mayor que 0")