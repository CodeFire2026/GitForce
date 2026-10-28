class Clase9Producto:
    contador_producto = 0 # variable clase

    def __init__(self, nombre, precio):
        Clase9Producto.contador_producto += 1 # aumento para la variable clase
        self.id_producto = Clase9Producto.contador_producto # asignacion desde la variable clase
        self.nombre = nombre
        self.precio = precio

# metodo setters y getters#
    @property
    def nombre(self):
         return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def precio(self):
         return self._precio

    @precio.setter
    def precio(self, precio):
         self._precio = precio

    # sobreescribimos el metodo self
    def __str__(self):
     return f"Id Producto: [{self.id_producto}, Nombre: {self.nombre}, Precio: {self.precio}]"

if __name__ == "__main__": # solo será visible la prueba aquí
    producto1 = Clase9Producto("remera", 150.0)
    print(producto1)
    producto2 = Clase9Producto("pantalon", 110.0)
    print(producto2)