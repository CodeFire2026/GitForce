def ingresar_dinero(saldo):
    dinero = float(input("Ingrese el dinero a depositar: "))
    saldo += dinero
    print("Dinero ingresado correctamente.")
    return saldo


def retirar_dinero(saldo):
    dinero = float(input("Ingrese el dinero a retirar: "))

    if dinero <= saldo:
        saldo -= dinero
        print("Dinero retirado correctamente.")
    else:
        print("No tiene suficiente dinero.")

    return saldo


def mostrar_saldo(saldo):
    print("Dinero disponible:", saldo)


def menu():
    saldo = 1000

    while True:
        print("\n--- CAJERO AUTOMÁTICO ---")
        print("1. Ingresar dinero en la cuenta")
        print("2. Retirar dinero de la cuenta")
        print("3. Mostrar dinero disponible")
        print("4. Salir")

        opcion = int(input("Seleccione una opción: "))

        if opcion == 1:
            saldo = ingresar_dinero(saldo)
        elif opcion == 2:
            saldo = retirar_dinero(saldo)
        elif opcion == 3:
            mostrar_saldo(saldo)
        elif opcion == 4:
            print("Gracias por utilizar el cajero.")
            break
        else:
            print("Opción incorrecta.")


menu()