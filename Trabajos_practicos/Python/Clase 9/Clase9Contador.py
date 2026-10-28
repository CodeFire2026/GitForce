class Clase9Contador:
    contador_persona = 0

    def __init__(self, nombre, edad):
        Clase9Contador.contador_persona += 1
        self.id_persona = Clase9Contador.contador_persona
        self.nombre = nombre
        self.edad = edad


    def __str__(self):
        return f"Persona [{self.id_persona} = {self.nombre}{self.edad}]"


persona1 = Clase9Contador("Matias",20)
print(persona1)
persona2 = Clase9Contador("Mario",30)
print(persona2)
persona3 = Clase9Contador("Leonardo",27)
print(persona3)

print(f"Valor contador personas: {Clase9Contador.contador_persona}")
