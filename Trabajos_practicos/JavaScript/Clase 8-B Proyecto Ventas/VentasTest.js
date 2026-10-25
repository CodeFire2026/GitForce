const Producto = require('./Producto.js');
const Orden = require('./Orden.js');

let producto1 = new Producto("Pantalon", 200);
let producto2 = new Producto("Camisa", 100);

let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);

console.log("Total: $" + orden1.calcularTotal());
orden1.mostrarOrden();