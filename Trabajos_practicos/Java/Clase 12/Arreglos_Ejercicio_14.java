import java.util.Scanner;

public class Arreglos_Ejercicio_14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        System.out.println("Ingrese 10 numeros ordenados para A:");

        for (int i = 0; i < 10; i++) {
            A[i] = entrada.nextInt();
        }

        System.out.println("Ingrese 10 numeros ordenados para B:");

        for (int i = 0; i < 10; i++) {
            B[i] = entrada.nextInt();
        }

        int i = 0, j = 0, k = 0;

        while (i < 10 && j < 10) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i++;
            } else {
                C[k] = B[j];
                j++;
            }
            k++;
        }

        while (i < 10) {
            C[k] = A[i];
            i++;
            k++;
        }

        while (j < 10) {
            C[k] = B[j];
            j++;
            k++;
        }

        System.out.println("\nTabla fusionada y ordenada:");

        for (int n = 0; n < 20; n++) {
            System.out.println(C[n]);
        }

        entrada.close();
    }
}