#login para que además del nombre de usuario pida una contraseña y valide que la contraseña tenga al menos 8 caracteres.
while True: # Bucle infinito hasta que el login sea correcto ya que true siempre es verdadero
    usuario = "Raul"
    contrasena = "password123"  # Contraseña predefinida
    introducido_usuario = input("Usuario: ").lower() # Solicitar el usuario y convertir a minúsculas
    introducido_contrasena = input("Contraseña: ")  # Solicitar la contraseña
    if usuario.lower() == introducido_usuario: # Comprobar si el usuario es correcto, sin distinguir mayúsculas
        if len(introducido_contrasena) >= 8:  # Verificar que la contraseña tiene al menos 8 caracteres
            if introducido_contrasena == contrasena:  # Comprobar si la contraseña es correcta
                print("Login correcto")
                break # Salir del bucle
            else:
                print("Contraseña incorrecta. Intenta de nuevo.")
        else:
            print("La contraseña debe tener al menos 8 caracteres. Intenta de nuevo.")
    else:
        print("Usuario incorrecto. Intenta de nuevo.")

