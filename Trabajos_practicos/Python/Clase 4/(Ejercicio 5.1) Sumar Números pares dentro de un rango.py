# Ejercicio 4: Sumar números pares dentro de un rango
inicio = 2
fin = 30
suma = 0
for numero in range(inicio, fin + 1):
    if numero % 2 == 0:          # Sumara numeros pares
        suma += numero

print(f"Suma de números pares del {inicio} al {fin} = {suma}")