/*Pedir numeros hasta que se introduzca uno negativo y calcular la media*/
package Ciclos;

import javax.swing.JOptionPane;

public class Ejercicio7JOptionPane {
    public static void main(String[] args) {
        int numero;
        int suma = 0;
        int contador = 0;
        double media;

        /* Pedimos el primer número */
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número (negativo para terminar):"));

        /* Mientras el número no sea negativo, seguimos pidiendo y acumulando */
        while (numero >= 0) {
            suma += numero;      /* Acumulamos la suma */
            contador++;          /* Contamos cuántos números positivos se ingresaron*/
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número (negativo para terminar):"));
        }

        /* Calculamos y mostramos la media */
        if (contador > 0) {
            media = (double) suma / contador;
            JOptionPane.showMessageDialog(null, "La media de los números introducidos es: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron números positivos.");
        }
    }
}
