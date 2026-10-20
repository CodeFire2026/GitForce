# Esta clase hereda de la clase Object
class Persona:
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    # Getters
    def get_nombre(self):
        return self._nombre

    def get_edad(self):
        return self._edad

    # Setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_edad(self, edad):
        self._edad = edad

# Esta clase es hija de la clase Persona
class Empleado(Persona):
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    # Getter
    def get_sueldo(self):
        return self._sueldo

    # Setter
    def set_sueldo(self, sueldo):
        self._sueldo = sueldo

# Crear un objeto
empleado1 = Empleado('Ariel', 40, 75000)

# Mostrar los datos usando getters
print("Datos iniciales:")
print(f"Nombre: {empleado1.get_nombre()}")
print(f"Edad: {empleado1.get_edad()}")
print(f"Sueldo: {empleado1.get_sueldo()}")

print("\nModificando los datos")

# Modificar los datos usando setters
empleado1.set_nombre("Ariel González")
empleado1.set_edad(41)
empleado1.set_sueldo(82000)

# Mostrar los datos nuevamente
print("Datos después de modificar:")
print(f"Nombre: {empleado1.get_nombre()}")
print(f"Edad: {empleado1.get_edad()}")
print(f"Sueldo: {empleado1.get_sueldo()}")