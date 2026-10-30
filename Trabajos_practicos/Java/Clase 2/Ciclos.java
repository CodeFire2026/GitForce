import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite un número: ");
        int numero = scanner.nextInt();
        
        while (numero >= 0) { // El ciclo se repite mientras el número sea positivo o cero
            int cuadrado = (int) Math.pow(numero, 2); // O también puedes usar: numero * numero
            System.out.println("El número " + numero + " elevado al cuadrado es: " + cuadrado);
            
            System.out.print("Digite otro número (negativo para salir): ");
            numero = scanner.nextInt();
        }
        
        System.out.println("El programa ha finalizado porque ingresó un número negativo.");
        scanner.close();
    }
}