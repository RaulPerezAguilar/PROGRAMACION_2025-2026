#1 inversor de palabras
palabra = input("Introduce una palabra: ")
#Invertimos la palabra usando slicing
palabra2 = palabra[::-1] #[::1] hace que se recorra la cadena al reves
print(palabra2)
#2 limpieza de datos
#Tenamos la cadena " juan.perez@dominio.com "
#Tarea A: Elmina los espacios en blanco al inicio y al final
texto = " juan.perez@dominio.com "
texto2 = texto.strip() #Elimina los espacios en blanco al inicio y al final
print (texto2)
#Tarea B: Convierte en mayusculas
texto3 = texto2.upper() #Convierte todo a mayusculas
print(texto3)
#Tarea C: Separa el nombre del dominio (juan.perez y dominio.com) con .split() y el separador @
texto4 = texto2.split("@") #Separa la cadena en dos partes usando @ como separador
print(texto4)
