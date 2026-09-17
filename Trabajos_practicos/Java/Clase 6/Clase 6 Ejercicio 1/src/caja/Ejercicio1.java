/*ejercicio 1, crear un proyecto segun las esspecificaciones mostradas*/
/*La formula es: volumen = ancho * alto * profundidad*/
package caja;

public class Ejercicio1 {
    
    // Atributos
    int ancho;
    int alto;
    int profundidad;
    
    // Constructor vacío
    public Ejercicio1() {
        System.out.println("Se ejecutó el constructor vacío");
    }
    
    // Constructor con argumentos
    public Ejercicio1(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
        System.out.println("Se ejecutó el constructor con argumentos");
    }
    
    // Método para calcular el volumen
    public int calcularVolumen() {
        return ancho * alto * profundidad;
    }
}