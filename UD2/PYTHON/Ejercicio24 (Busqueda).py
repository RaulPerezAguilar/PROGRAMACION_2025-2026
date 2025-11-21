import re
data = """
Usuario: perez.juan
Email de contacto: juan.perez@dominio.com
Fecha de acceso: 15-09-2023
Codigo de cliente: ABC123456
Telefono de emergencia: 601 234 567
Archivos encontrados: a_1.txt, b_22.py, c_333.pdf, d_4444.jpg
"""
# Buscar todos los emails
emails = re.findall('[a-zA-Z0-9._+-]+@[a-zA-Z0-9_.+-]+.[a-zA-Z0-9_.]', data)
print("Emails encontrados:", emails)
# Buscar todas las fechas en formato DD-MM-AAAA
fechas = r'\d{2}-\d{2}-\d{4}'
print("Fechas encontradas:", re.findall(fechas, data))
