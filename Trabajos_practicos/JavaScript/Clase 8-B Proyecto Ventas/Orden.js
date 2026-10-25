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
module.exports = Orden;