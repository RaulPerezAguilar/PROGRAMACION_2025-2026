import re
texto = "Nacio en 1985 y el libro es de 2023"
patron = r'\d{4}' # Busca exactamente cuatro dígitos
print(re.findall(patron, texto))
# Salida: ['1985', '2023']