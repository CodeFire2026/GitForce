# Ejercicio 1: Llenar una lista
# Llenar una lista con los números del 1 al 50, luego mostrar
# la lista con el bucle for, los elementos deben mostrarse
# de la siguiente forma:
# 1-2-3-4-5...-50

# Llenamos la lista con los números del 1 al 50 usando list() y range()
lista = list(range(1, 51))

# Recorremos y mostramos con el bucle for
for i in lista:
    if i < 50:
        print(f"{i}-", end="")
    else:
        print(f"{i}")