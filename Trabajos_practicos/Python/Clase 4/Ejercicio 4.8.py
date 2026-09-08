# Ejercicio 3: Insertar elementos y ordenarlos
# Pedir números y meterlos en una lista, cuando el usuario
# introduzca un número 0, nuestro programa dejaría de insertar.
# Por último, mostrar los números ordenados de menor a mayor.

lista = []
salir = False

while not salir:
    numero = int(input("Ingrese un número (0 para finalizar): "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)

# Ordenamos la lista de menor a mayor con la función sort()
lista.sort()

# Mostramos la lista ordenada
print(f"\nLista de números ordenados de menor a mayor: {lista}")