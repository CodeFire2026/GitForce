class Producto{
    static contadorProductos = 0;
    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }
    getPrecio(){ return this._precio; }
    toString(){ return `${this._nombre} $${this._precio}`; }
}
class Orden{
    static contadorOrdenes = 0;
    static get MAX_PRODUCTOS(){ return 5; }
    
    constructor(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = [];
    }
    agregarProducto(producto){
        if(this.productos.length < Orden.MAX_PRODUCTOS){
            this.productos.push(producto);
        } else {
            console.log("No se pueden agregar más productos a la orden.");
        }
    }
    calcularTotal(){
        let total = 0;
        for(let producto of this.productos){
            total += producto.getPrecio();
        }
        return total;
    }
    mostrarOrden(){
        let productosStr = "";
        for(let producto of this.productos){
            productosStr += "\n" + producto.toString();
        }
        console.log(`Orden: ${this.idOrden} Total: $${this.calcularTotal()}, Productos: ${productosStr}`);
    }
}

let producto1 = new Producto("Pantalon", 200);
let producto2 = new Producto("Camisa", 100);

let orden1 = new Orden();
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);
orden1.agregarProducto(producto1);
orden1.agregarProducto(producto2);

console.log("Total: $" + orden1.calcularTotal());
orden1.mostrarOrden();