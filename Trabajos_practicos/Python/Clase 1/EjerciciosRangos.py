#Ejercicio 1: Iterar un rango de 0 a 10 e imprimir los números divisibles por 3
print(str("Numeros Divisibles por 3 (Rango 0 al 10)"))
for numero in range(0, 11):
    if numero % 3 == 0:
        print(numero)

#Ejercicio 2: Crear un rango de números de 2 a 6 e imprimirlos
print(str("Rango de números de 2 a 6"))
for numero in range(2, 7):
    print(numero)

#Ejercicio 3: Crear un rango de 3 a 10 con incremento de 2 en 2:
print(str("Rango de 3 a 10 incrementado de 2 en 2"))
for numero in range(3, 11, 2):
    print(numero)