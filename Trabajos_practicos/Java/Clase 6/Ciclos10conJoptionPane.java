

import javax.swing.JOptionPane;

public class Ciclos10conJoptionPane {

    public static void main(String[] args) {

        int suma = 0;

        for (int i = 1; i <= 10; i++) {

            int numero = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese numeros para sumarlos, N: " + i)
            );

            suma = suma + numero;
        }

        JOptionPane.showMessageDialog(
            null,
            "La suma total es: " + suma
        );
    }
}