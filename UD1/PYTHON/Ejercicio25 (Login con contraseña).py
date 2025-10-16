while True:
    nombre = input("Introduce tu nombre de usuario: ")
    contrasena = input("Introduce tu contraseña: ")
    longitud = len(contrasena)
    if longitud < 8:
        print("La contraseña debe tener al menos 8 caracteres. Inténtalo de nuevo.")
    else:
        print(f"Bienvenido, {nombre}!")
        break