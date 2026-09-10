import java.util.Scanner;

public class Ciclos08conScanner {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero N: ");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        teclado.close();
    }
}