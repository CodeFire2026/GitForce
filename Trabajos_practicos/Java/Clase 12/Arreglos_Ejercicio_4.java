
import java.util.Scanner;

public class Arreglos_Ejercicio_4 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese un numero entero: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\nNumeros en el orden solicitado:");

        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[9 - i]);
        }

        entrada.close();
    }
}