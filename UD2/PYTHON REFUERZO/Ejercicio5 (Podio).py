podio = ["Oro", "Bronce", "Plata"]
print("El podio de medallas desordenado es: " + str(podio))
#insertamos la medalla de plata en la posición correcta
podio.insert(1, podio.pop(2))
print("El podio de medallas ordenado es: " + str(podio))