class Persona {
    constructor(nombre, apellido) {
        this._nombre = nombre;
        this._apellido = apellido;
    }

    // Método get para el apellido
    get apellido() {
        return this._apellido;
    }

    // Método set para el apellido
    set apellido(nuevoApellido) {
        this._apellido = nuevoApellido;
    }
}

// 1. Creamos un objeto de prueba
let persona1 = new Persona("Juan", "Perez");

// 2. Modificamos el apellido a través del método set
persona1.apellido = "Gomez";

// 3. Mostramos con un console.log lo que devuelve el get
console.log(persona1.apellido); // Debería imprimir: Gomez