i = 1
while True:
    print ("Hasta que numero quieres contar: ")
    n = int(input())
    if n >= 0:
        while n >= i:
            if n == i:
                print(i)
                break
            else:
                print(i , end=',')
                i = i + 1
        break
    else:
        print ("El numero debe ser mayor que 0")