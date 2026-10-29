import java.util.Scanner;

public class Arreglos_Ejercicio_12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + i + ": ");
            numeros[i] = entrada.nextInt();
        }

        int posicion;

        do {
            System.out.print("Ingrese la posicion que desea eliminar (0 a 9): ");
            posicion = entrada.nextInt();

            if (posicion < 0 || posicion > 9) {
                System.out.println("Posicion invalida. Intente nuevamente.");
            }

        } while (posicion < 0 || posicion > 9);

        for (int i = posicion; i < 9; i++) {
            numeros[i] = numeros[i + 1];
        }

        System.out.println("\nTabla despues de eliminar el elemento:");

        for (int i = 0; i < 9; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }

        entrada.close();
    }
}