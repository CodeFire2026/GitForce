import javax.swing.JOptionPane;

public class Ciclos11JOP {
    public static void main(String[] args) {
        long producto = 1;

        // Bucle para iterar por los primeros 10 números impares
        // Fórmula del impar: (2 * i) + 1
        for (int i = 0; i < 10; i++) {
            int impar = (2 * i) + 1;
            producto *= impar; // Multiplica el acumulado por el impar actual
        }

        // Mostrar el resultado en una ventana emergente
        JOptionPane.showMessageDialog(null, "El producto de los 10 primeros números impares es: " + producto);
    }
}