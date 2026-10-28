from Clase9Producto import Clase9Producto


class Clase9Orden:
    contador_ordenes = 0

    def __init__(self, productos):
        Clase9Orden.contador_ordenes += 1
        self.id_orden = Clase9Orden.contador_ordenes
        self._productos = list(productos)

    def agregar_producto(self, producto):
        self._productos.append(producto)

    def calcular_total(self):
        total = 0
        for producto in self._productos:
            total += producto.precio
        return total

    def __str__(self):
        productos_str = ""
        for producto in self._productos:
            productos_str += producto.__str__() + "|"
        return f"Orden: {self.id_orden}, \nProductos: {productos_str}"


if __name__ == "__main__":
    # Productos originales para orden1
    producto1 = Clase9Producto("remera", 150.0)
    producto2 = Clase9Producto("pantalon", 110.0)
    productos1 = [producto1, producto2]
    orden1 = Clase9Orden(productos1)
    print(orden1)
    print(f"Total orden1: {orden1.calcular_total()}")

    # nuevos productos y nueva lista para orden2
    producto3 = Clase9Producto("camisa", 220.0)
    producto4 = Clase9Producto("zapatos", 350.0)
    producto5 = Clase9Producto("gorra", 80.0)

    productos2 = [producto3, producto4, producto5]  # nueva lista de productos
    orden2 = Clase9Orden(productos2)  # orden2 con la nueva lista
    print(orden2)
    print(f"Total orden2: {orden2.calcular_total()}")