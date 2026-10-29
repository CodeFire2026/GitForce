import java.util.Scanner;

public class Arreglos_Ejercicio_11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 5 numeros en orden creciente:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            while (i > 0 && numeros[i] < numeros[i - 1]) {
                System.out.println("Error. Ingrese un numero mayor o igual al anterior.");
                System.out.print("Numero " + (i + 1) + ": ");
                numeros[i] = entrada.nextInt();
            }
        }

        System.out.print("\nIngrese el numero N que desea insertar: ");
        int N = entrada.nextInt();

        int i = 4;

        while (i >= 0 && numeros[i] > N) {
            numeros[i + 1] = numeros[i];
            i--;
        }

        numeros[i + 1] = N;

        System.out.println("\nTabla ordenada con el numero insertado:");

        for (int j = 0; j < 6; j++) {
            System.out.println(numeros[j]);
        }

        entrada.close();
    }
}