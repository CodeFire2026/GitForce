

import java.util.Scanner;

public class Ciclos10conScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese numeros para sumarlos, N: " + i + ": ");
            int numero = scanner.nextInt();

            suma = suma + numero;
        }

        System.out.println("La suma total es: " + suma);

        scanner.close();
    }
}