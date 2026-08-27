import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = (int) (Math.random() * 101);
        int numero;
        int intentos = 0;

        System.out.println("Adivina el numero entre 0 y 100");

        do {
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();

            intentos++;

            if (numero > numeroAleatorio) {
                System.out.println("Es menor");
            } else if (numero < numeroAleatorio) {
                System.out.println("Es mayor");
            }

        } while (numero != numeroAleatorio);

        System.out.println("Adivinaste");
        System.out.println("Cantidad de intentos: " + intentos);

        scanner.close();
    }
}