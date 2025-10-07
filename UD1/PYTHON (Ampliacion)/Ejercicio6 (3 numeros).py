print ("Dime un numero: ")
num1 = int(input())
print ("Dime otro numero: ")
num2 = int(input())
print ("Dime otro numero mas: ")
num3 = int(input())
match (num1, num2, num3):
    case (x,y,z) if x == y == z:
        print("Los tres numeros son iguales")
    case (x,y,z) if x != y and x == z or x != z and x == y or y != x and y == z or y != z and y == x or z != x and z == y or z != y and z == x:
        print("Hay dos numeros iguales")
    case (x,y,z) if x != y and x != z and y != z:
        print("Los tres numeros son diferentes")