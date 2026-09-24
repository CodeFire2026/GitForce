public class Ciclos11Sc {
    public static void main(String[] args) {
        long producto = 1;

        // Bucle para iterar por los primeros 10 números impares (1, 3, 5, ..., 19)
        for (int i = 1; i <= 19; i += 2) {
            producto *= i;
        }

        System.out.println("El producto de los 10 primeros números impares es: " + producto);
    }
}