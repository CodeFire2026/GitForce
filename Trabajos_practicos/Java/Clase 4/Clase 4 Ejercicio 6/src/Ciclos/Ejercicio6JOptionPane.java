/*pedir números hasta que el usuario introduzca un 0 
y luego mostrar la suma de todos los números introducidos.*/
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio6JOptionPane {
    public static void main(String[] args) {
        int numero;
        int suma = 0;

        // Pedimos el primer número
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número (0 para terminar):"));

        // Mientras el número no sea 0, seguimos pidiendo y sumando
        while (numero != 0) {
            suma += numero; // Acumulamos la suma
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número (0 para terminar):"));
        }

        // Mostramos el resultado
        JOptionPane.showMessageDialog(null, "La suma de todos los números introducidos es: " + suma);
    }
}
