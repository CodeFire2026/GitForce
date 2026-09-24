import javax.swing.JOptionPane;

public class Ciclos12JOP {
    public static void main(String[] args) {
        long factorial = 1;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número para calcular su factorial:"));

        // Calcular el factorial mediante un bucle
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}