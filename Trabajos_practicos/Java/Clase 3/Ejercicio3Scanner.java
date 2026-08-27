import java.util.Scanner;

public class Ejercicio3Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    System.out.println("El numero es par");
                } else {
                    System.out.println("El numero es impar");
                }
            }

        } while (numero != 0);

        System.out.println("Programa finalizado");
        scanner.close();
    }
}