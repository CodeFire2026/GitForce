import java.util.Scanner;

public class Arreglos_Ejercicio_15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Ingrese 10 numeros ordenados crecientemente:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Ingrese el numero N que desea buscar: ");
        int N = entrada.nextInt();

        int posicion = -1;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == N) {
                posicion = i;
                break;
            }

            if (numeros[i] > N) {
                break;
            }
        }

        if (posicion != -1) {
            System.out.println("El numero se encuentra en la posicion: " + posicion);
        } else {
            System.out.println("El numero no se encuentra en la tabla.");
        }

        entrada.close();
    }
}