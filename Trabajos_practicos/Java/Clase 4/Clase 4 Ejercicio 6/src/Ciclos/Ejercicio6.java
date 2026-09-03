/*pedir números hasta que el usuario introduzca un 0 
y luego mostrar la suma de todos los números introducidos.*/
package Ciclos;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        
        System.out.println("Digite un numero: "); /*el numero cero termina el programa*/
        
        do {
            System.out.print("Número: "); /*se crea bucle para pedir mas de un numero*/
            numero = sc.nextInt();
            
            if (numero != 0) {
                suma += numero;   /*se suma si no es cero*/
            }
            
        } while (numero != 0);
        
        System.out.println("\nLa suma de los números introducidos es: " + suma);
        
        sc.close();
    }
}
