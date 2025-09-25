while True: # Bucle infinito hasta que el login sea correcto ya que true siempre es verdadero
    usuario = "Raul"
    introducido = input("Usuario: ").lower() # Solicitar el usuario y convertir a minúsculas
    if usuario.lower() == introducido: # Comprobar si el usuario es correcto, sin distinguir mayúsculas
        print("Login correcto")
        break # Salir del bucle
    else:
        print("Usuario incorrecto. Intenta de nuevo.")