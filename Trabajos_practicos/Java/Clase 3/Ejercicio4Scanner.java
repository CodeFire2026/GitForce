
import java.util.Scanner;

public class Ejercicio4Scanner {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;

        System.out.println("Ingrese numeros. Para terminar ingrese un numero negativo.");

        do {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                contador++;
            }

        } while (numero >= 0);

        System.out.println("Cantidad de numeros introducidos: " + contador);
    }
}
