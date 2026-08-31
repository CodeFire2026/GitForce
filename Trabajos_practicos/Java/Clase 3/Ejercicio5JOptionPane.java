import javax.swing.JOptionPane;

public class Ejercicio5JOptionPane {

    public static void main(String[] args) {

        int numeroAleatorio = (int) (Math.random() * 101);
        int numero;
        int intentos = 0;

        do {
            numero = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Adivina el numero entre 0 y 100"
                )
            );

            intentos++;

            if (numero > numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Es menor");
            } else if (numero < numeroAleatorio) {
                JOptionPane.showMessageDialog(null, "Es mayor");
            }

        } while (numero != numeroAleatorio);

        JOptionPane.showMessageDialog(
            null,
            "Adivinaste\nCantidad de intentos: " + intentos
        );
    }
}