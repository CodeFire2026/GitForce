import javax.swing.JOptionPane;

public class Ejercicio3JOptionPane {

    public static void main(String[] args) {

        int numero;

        do {
            numero = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Ingrese un numero (0 para terminar):"
                )
            );

            if (numero != 0) {
                if (numero % 2 == 0) {
                    JOptionPane.showMessageDialog(null, "El numero es par");
                } else {
                    JOptionPane.showMessageDialog(null, "El numero es impar");
                }
            }

        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "Programa finalizado");
    }
}