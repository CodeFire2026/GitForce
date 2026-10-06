#crear la clase Cubo con los atributos, ancho, alto y profundidad, con un método calcular_volumen que tendrá la fórmula:
#volumen = ancho _ altura _ profundidad
#que el usuario ingrese los valores.

class Cubo:
    def __init__(self, ancho, alto, profundidad):
        self.ancho = ancho
        self.alto = alto
        self.profundidad = profundidad

    def calcular_volumen(self):
        volumen = self.ancho * self.alto * self.profundidad
        return volumen

ancho = float(input("Ingresa el ancho: "))
alto = float(input("Ingresa el alto: "))
profundidad = float(input("Ingresa la profundidad: "))

mi_cubo = Cubo(ancho, alto, profundidad)

print(f"El volumen del cubo es: {mi_cubo.calcular_volumen()}")