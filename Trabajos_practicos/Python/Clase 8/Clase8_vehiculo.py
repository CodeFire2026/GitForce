class Vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return f"Color: {self.color}, Ruedas: {self.ruedas}"


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad  # en km/h

    def __str__(self):
        return f"Auto → Color: {self.color}, Ruedas: {self.ruedas}, Velocidad: {self.velocidad} km/h"


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo  # urbana, montaña, etc.

    def __str__(self):
        return f"Bicicleta → Color: {self.color}, Ruedas: {self.ruedas}, Tipo: {self.tipo}"


# Crear un objeto de cada clase

vehiculo1 = Vehiculo("Rojo", 4)
auto1 = Auto("Azul", 4, 180)
bici1 = Bicicleta("Verde", 2, "Montaña")

# Mostrar los objetos
print(vehiculo1)
print(auto1)
print(bici1)