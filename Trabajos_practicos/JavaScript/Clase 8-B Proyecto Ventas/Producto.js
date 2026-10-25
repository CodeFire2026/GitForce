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
module.exports = Producto;