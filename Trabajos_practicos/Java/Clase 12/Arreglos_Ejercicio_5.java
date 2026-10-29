import java.util.Scanner;

public class Arreglos_Ejercicio_5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        System.out.println("Ingrese los 10 numeros de la tabla A:");

        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = entrada.nextInt();
        }

        System.out.println("\nIngrese los 10 numeros de la tabla B:");

        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = entrada.nextInt();
        }

        int j = 0;

        for (int i = 0; i < 10; i++) {
            C[j] = A[i];
            j++;

            C[j] = B[i];
            j++;
        }

        System.out.println("\nTabla mezclada C:");

        for (int i = 0; i < 20; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }

        entrada.close();
    }
}
