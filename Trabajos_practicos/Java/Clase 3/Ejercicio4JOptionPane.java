import javax.swing.JOptionPane;

public class Ejercicio4JOptionPane {

    public static void main(String[] args) {

        int numero;
        int contador = 0;

        do {
            numero = Integer.parseInt(
                JOptionPane.showInputDialog(
                    "Ingrese un numero:\nIngrese un numero negativo para terminar"
                )
            );

            if (numero >= 0) {
                contador++;
            }

        } while (numero >= 0);

        JOptionPane.showMessageDialog(
            null,
            "Cantidad de numeros introducidos: " + contador
        );
    }
}