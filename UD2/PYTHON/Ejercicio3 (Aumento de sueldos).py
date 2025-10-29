sueldos = [1800, 1200, 2000, 1200, 900]
aumento = 0.10
for i in range(len(sueldos)):
    sueldos[i] = sueldos[i] + sueldos[i] * aumento  # Aplicar aumento del 10%
print(sueldos)