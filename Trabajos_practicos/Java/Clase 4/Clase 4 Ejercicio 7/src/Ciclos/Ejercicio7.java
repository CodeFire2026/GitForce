/*Pedir numeros hasta que se introduzca uno negativo y calcular la media*/
package Ciclos;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        int contador = 0;
        
        System.out.println("Digite numeros: ");
        
        do {
            System.out.print("Número: ");  /*usamos bucles para pedir varios numeros*/
            numero = sc.nextInt();
            
            if (numero >= 0) {
                suma += numero;  /*se suma y cuentan los numeros de cero y positivo*/
                contador++;
            }
            
        } while (numero >= 0);
        
        if (contador > 0) {
            double media = (double) suma / contador;    /*se calucla la media*/
            System.out.println("\nLa media de los números introducidos es: " + media);
        } else {
            System.out.println("\nNo se introdujeron números válidos.");
        }
        
        sc.close();     /*se usan double para que el resultado de la media de decimales*/
    }
}
