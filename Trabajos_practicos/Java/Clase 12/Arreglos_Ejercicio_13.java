import java.util.Scanner;

public class Arreglos_Ejercicio_13 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int j = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero entero: ");
            A[i] = entrada.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) {
                B[j] = A[i];
                j++;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 != 0) {
                B[j] = A[i];
                j++;
            }
        }

        System.out.println("\nTabla con pares primero e impares despues:");

        for (int i = 0; i < 10; i++) {
            System.out.println(B[i]);
        }

        entrada.close();
    }
}