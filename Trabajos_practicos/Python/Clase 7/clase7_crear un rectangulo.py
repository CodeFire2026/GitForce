class Rectangulo:

    #creamos una clase llamada rectangulo, debe de tener 2 atributos: altura y base
    #y el nombre del metodo sera calcular area utilizando la siguiente formula:
    #area = base * altura. Pero la base y la altura deben ser ingresadas por el
    #suario y los objetos deben ser 3

#definimos clase:

    def __init__(self, base, altura):
        self.base = base
        self.altura = altura

    def calcular_area(self):
        area = self.base * self.altura
        return area

# se crea 3 objetos que pidan datos al usuario

print("--- Rectángulo 1 ---")
base1 = float(input("Ingrese la base del rectángulo 1: "))
altura1 = float(input("Ingrese la altura del rectángulo 1: "))
rect1 = Rectangulo(base1, altura1)

print("\n--- Rectángulo 2 ---")
base2 = float(input("Ingrese la base del rectángulo 2: "))
altura2 = float(input("Ingrese la altura del rectángulo 2: "))
rect2 = Rectangulo(base2, altura2)

print("\n--- Rectángulo 3 ---")
base3 = float(input("Ingrese la base del rectángulo 3: "))
altura3 = float(input("Ingrese la altura del rectángulo 3: "))
rect3 = Rectangulo(base3, altura3)

# se calcula y muestra el area del rectangulo

print(" RESULTADOS ")
print(f"Área del Rectángulo 1: {rect1.calcular_area()}")
print(f"Área del Rectángulo 2: {rect2.calcular_area()}")
print(f"Área del Rectángulo 3: {rect3.calcular_area()}")