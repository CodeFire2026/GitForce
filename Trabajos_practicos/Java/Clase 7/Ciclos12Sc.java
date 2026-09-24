import java.util.Scanner;

public class Ciclos12Sc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long factorial = 1;

        System.out.print("Digite un número para calcular su factorial: ");
        int numero = sc.nextInt();

        // Calcular el factorial mediante un bucle
        for (int i = 1; i <= numero; i++) {
            factorial *= i; // Multiplica acumuladamente
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        sc.close();
    }
}