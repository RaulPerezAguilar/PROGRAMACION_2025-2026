a = ["h","o","l","a"]
b = ["H","o","l","a"]
c = ["H","O","L","A"]
def comparar(a,b,c):
    a2 = [x.lower() for x in a]
    b2 = [x.lower() for x in b]
    c2 = [x.lower() for x in c]
    if a2 == b2 == c2:
        print("Son iguales sin comparar mayusculas")
    else:
        print("Son diferentes")
comparar(a,b,c)