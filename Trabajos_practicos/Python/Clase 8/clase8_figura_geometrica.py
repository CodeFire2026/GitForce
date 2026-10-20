class FiguraGeometrica:
    def __init__(self, alto=0, ancho=0):
        self.__alto = alto
        self.__ancho = ancho

    def get_alto(self):
        return self.__alto

    def set_alto(self, alto):
        self.__alto = alto

    def get_ancho(self):
        return self.__ancho

    def set_ancho(self, ancho):
        self.__ancho = ancho

    def __str__(self):
        return f"FiguraGeometrica[alto={self.__alto}, ancho={self.__ancho}]"


class Color:
    def __init__(self, color=""):
        self.__color = color

    def get_color(self):
        return self.__color

    def set_color(self, color):
        self.__color = color

    def __str__(self):
        return f"Color[color={self.__color}]"


class Cuadrado(FiguraGeometrica):
    def __init__(self, lado=0):
        # En un cuadrado alto y ancho son iguales
        super().__init__(alto=lado, ancho=lado)

    def area(self):
        return self.get_alto() * self.get_ancho()

    def __str__(self):
        return f"Cuadrado[lado={self.get_alto()}, área={self.area()}]"


class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, alto=0, ancho=0, color=""):
# Llamamos a los constructores de ambas clases padre
        FiguraGeometrica.__init__(self, alto, ancho)
        Color.__init__(self, color)

    def area(self):
        return self.get_alto() * self.get_ancho()

    def __str__(self):
        return (f"Rectangulo[alto={self.get_alto()}, "
                f"ancho={self.get_ancho()}, "
                f"color={self.get_color()}, "
                f"área={self.area()}]")
# La Prueba
if __name__ == "__main__":
    print("=== Cuadrado ===")
    c = Cuadrado(5)
    print(c)
    print(f"Área: {c.area()}")
    print(c.get_alto(), c.get_ancho())

    print("\n=== Rectángulo ===")
    r = Rectangulo(4, 6, "rojo")
    print(r)
    print(f"Área: {r.area()}")
    print(f"Color: {r.get_color()}")

    # Cambiar valores
    r.set_alto(10)
    r.set_ancho(8)
    r.set_color("azul")
    print("\nDespués de modificar:")
    print(r)