import javax.swing.JOptionPane;

public class Ciclos09ConJoptionPane {

public static void main(String[] args) {

    int dia = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese el dia:")
    );

    int mes = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese el mes:")
    );

    int anio = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese el ano:")
    );

    if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && anio > 0) {
        JOptionPane.showMessageDialog(null, "La fecha es correcta.");
    } else {
        JOptionPane.showMessageDialog(null, "La fecha es incorrecta.");
    }
}

}
