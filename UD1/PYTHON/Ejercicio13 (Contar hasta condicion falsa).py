i = 1
while True:
    print ("Hasta que numero quieres contar: ")
    n = int(input())
    if n >= 0:
        while True:
            if i > n:
                break
            elif n == i:
                print(i)
                i = i + 1
            else:
                print(i , end=',')
                i = i + 1
        break
    else:
        print ("El numero debe ser mayor que 0")