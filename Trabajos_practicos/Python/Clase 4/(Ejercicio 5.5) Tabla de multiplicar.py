# Ejercicio 6: Tabla de multiplicar
numero = int(input("Digite un número: "))

tabla = []
for i in range(1, 11):
    tabla.append(numero * i)        # append para agregar cada resultado a la lista

print(f"La tabla de multiplicar de {numero} es: {tabla}")