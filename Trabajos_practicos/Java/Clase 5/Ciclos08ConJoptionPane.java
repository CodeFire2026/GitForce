import javax.swing.JOptionPane;

public class Ciclos08ConJoptionPane {

    public static void main(String[] args) {

        int n = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese un numero N:")
        );

        String numeros = "";

        for (int i = 1; i <= n; i++) {
            numeros += i + "\n";
        }

        JOptionPane.showMessageDialog(null, numeros);
    }
}