/*metodo Scanner*/
package caja;

import java.util.Scanner;

public class PruebaEjercicio1 {
    
    public static void main(String[] args) {
        
        //Objeto 1: usando el constructor vacío
        try (Scanner sc = new Scanner(System.in)) {
            //Objeto 1: usando el constructor vacío
            Ejercicio1 caja1 = new Ejercicio1();
            
            System.out.print("Ingrese el ancho de la caja 1: ");
            caja1.ancho = sc.nextInt();
            
            System.out.print("Ingrese el alto de la caja 1: ");
            caja1.alto = sc.nextInt();
            
            System.out.print("Ingrese la profundidad de la caja 1: ");
            caja1.profundidad = sc.nextInt();
            
            System.out.println("El volumen de la caja 1 es: " + caja1.calcularVolumen());
            System.out.println("----------------------------------------");
            
            //Objeto 2: usando el constructor con argumentos
            System.out.print("Ingrese el ancho de la caja 2: ");
            int ancho2 = sc.nextInt();
            
            System.out.print("Ingrese el alto de la caja 2: ");
            int alto2 = sc.nextInt();
            
            System.out.print("Ingrese la profundidad de la caja 2: ");
            int profundidad2 = sc.nextInt();
            
            Ejercicio1 caja2 = new Ejercicio1(ancho2, alto2, profundidad2);
            
            System.out.println("El volumen de la caja 2 es: " + caja2.calcularVolumen());
        }
    }
}

/*metodo JOptionPane*/


/*import javax.swing.JOptionPane;

public class PruebaEjercicio1 {
    
    public static void main(String[] args) {
        
        //Objeto 1: usando el constructor vacío
        Ejercicio1 caja1 = new Ejercicio1();
        
        caja1.ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho de la caja 1:"));
        caja1.alto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto de la caja 1:"));
        caja1.profundidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la profundidad de la caja 1:"));
        
        JOptionPane.showMessageDialog(null, "El volumen de la caja 1 es: " + caja1.calcularVolumen());
        
        //Objeto 2: usando el constructor con argumentos
        int ancho2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho de la caja 2:"));
        int alto2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto de la caja 2:"));
        int profundidad2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la profundidad de la caja 2:"));
        
        Ejercicio1 caja2 = new Ejercicio1(ancho2, alto2, profundidad2);
        
        JOptionPane.showMessageDialog(null, "El volumen de la caja 2 es: " + caja2.calcularVolumen());
    }
}*/