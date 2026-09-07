# Ejercicio 5: Factorial de un número positivo
numero = int(input("digite un número positivo: "))

if numero < 0:
    print("El número debe ser positivo.")
else:
    factorial = 1                   # variable factorial que empieza de 1 y multiplica
    for i in range(1, numero + 1):
        factorial *= i

    print(f"El factorial de {numero} es: {factorial}")