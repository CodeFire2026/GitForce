import random

def generar_numero():
    return random.randint(1, 100)


def adivinar_numero(numero_secreto):
    intentos = 0

    while True:
        numero = int(input("Ingrese un número: "))
        intentos += 1

        if numero > numero_secreto:
            print("Es menor")
        elif numero < numero_secreto:
            print("Es mayor")
        else:
            print("¡Adivinaste!")
            return intentos


numero_secreto = generar_numero()
intentos = adivinar_numero(numero_secreto)

print("Cantidad de intentos:", intentos)