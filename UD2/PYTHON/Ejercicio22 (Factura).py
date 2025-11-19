#simular la generacion de un recibo o factura. Debes usar f-strings para incrstar variables
#una pequeña cafeteria necesita automatizar la impresion de sus recibos. Tienes todas las variables lstas, solo necesitas combinarlas
#Variables del producto
producto = "Espresso Doble"
precio_unitario = 3.50
#Variables del transaccion
cantidad = 3
tasa_iva = 0.16 #16%
#variables del cliente
nombre_cliente = "Ana Maria Lopez"
id_transaccion = "CAF-2025-472"
#Calculos
subtotal = precio_unitario * cantidad
iva = subtotal * tasa_iva
total = subtotal + iva
#Impresion del recibo
print(f"--RECIBO DE LA CAFETERIA ----- {id_transaccion} ---------")
print(f"Cliente: {nombre_cliente}")
print(f"Producto: {producto} x {cantidad} ${precio_unitario:.2f} c/u")
print(f"Subtotal: ${subtotal:.2f}")
print(f"IVA (16%): ${iva:.2f}")
print(f"Total a pagar: ${total:.2f}")
print(f"-------------------------------")