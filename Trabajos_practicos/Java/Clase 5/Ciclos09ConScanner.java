import java.util.Scanner;

public class Ciclos09ConScanner {

public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.print("Ingrese el dia: ");
    int dia = teclado.nextInt();

    System.out.print("Ingrese el mes: ");
    int mes = teclado.nextInt();

    System.out.print("Ingrese el ano: ");
    int anio = teclado.nextInt();

    if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && anio > 0) {
        System.out.println("La fecha es correcta.");
    } else {
        System.out.println("La fecha es incorrecta.");
    }

    teclado.close();
}

}
