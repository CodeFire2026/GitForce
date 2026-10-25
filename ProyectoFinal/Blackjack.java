package ProyectoFinal;
import java.util.Scanner;

public class Blackjack {

    // Subproceso recursivo traducido a Java
    public static void conteoRegresivoEfecto(int tiempo) {
        if (tiempo == 0) {
           System.out.println("¡La Casa revela sus cartas!");
        } else {
            System.out.println("Pensando jugada... ten paciencia " + tiempo + "...");
            try {
             Thread.sleep(3000); // Pausa de 3 segundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            conteoRegresivoEfecto(tiempo - 1);
        }
    }

    // Método para obtener una carta aleatoria (1 a 10)
    public static int obtenerCarta() {
        return (int) (Math.random() * 10) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instancia de objetos (POO)
        Jugador jugador = new Jugador(10);
        Jugador casa = new Jugador(10);

        // Matriz para el historial de partidas
        int[][] historialPartidas = new int[3][2];
        
        int partidaActual = 1;
        String continuarPartidas = "S";
        boolean jugadorSePlanto;
        String opcionJuego;

        // Inicializar la matriz llenándola con ceros
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                historialPartidas[i][j] = 0;
            }
        }

        System.out.println("=== ¡BIENVENIDO JUGADOR! AL CASINO: ¡BLACKJACK! ===");
        System.out.println("ESPERAMOS TE DIVIERTAS. ¡BUENA SUERTE!.");
        System.out.println();

        // Bucle principal de partidas
        while (continuarPartidas.equalsIgnoreCase("S") && partidaActual <= 3) {
            System.out.println("--- PARTIDA NÚMERO " + partidaActual + " ---");
            
            jugador.reiniciarMano();
            casa.reiniciarMano();
            jugadorSePlanto = false;

            // Repartir cartas iniciales
            jugador.agregarCarta(obtenerCarta());
            jugador.agregarCarta(obtenerCarta());
            casa.agregarCarta(obtenerCarta());

            // Bucle do-while para el turno del jugador
            do {
                jugador.calcularPuntaje();

                System.out.print("Tus cartas actuales son: ");
                int[] cartasJ = jugador.getCartas();
                for (int i = 0; i < jugador.getCantCartas(); i++) {
                    System.out.print(cartasJ[i] + "  ");
                }
                System.out.println(" (Total: " + jugador.getPuntos() + ")");

                System.out.println("Carta visible de la Casa: " + casa.getCartas()[0]);

                if (jugador.getPuntos() < 21) {
                    System.out.println("¿Deseas [P]edir carta o [S]plantarte? (P/S):");
                    opcionJuego = scanner.next();

                    if (opcionJuego.equalsIgnoreCase("P")) {
                        int nuevaCarta = obtenerCarta();
                        jugador.agregarCarta(nuevaCarta);
                        System.out.println("Te ha tocado un: " + nuevaCarta);
                    } else if (opcionJuego.equalsIgnoreCase("S")) {
                        jugadorSePlanto = true;
                    } else {
                        System.out.println("Opción inválida. Intenta de nuevo.");
                    }
                }

            } while (jugador.getPuntos() < 21 && !jugadorSePlanto);

            jugador.calcularPuntaje();
            casa.calcularPuntaje();

            // Turno de la casa si el jugador no se pasó de 21
            if (jugador.getPuntos() <= 21) {
                System.out.println();
                System.out.println("--- Turno de la Casa ---");
                conteoRegresivoEfecto(3);
                System.out.println();

                while (casa.getPuntos() < 17) {
                    int cartaCasaNueva = obtenerCarta();
                    casa.agregarCarta(cartaCasaNueva);
                    System.out.println("La Casa pide carta y recibe: " + cartaCasaNueva);
                    casa.calcularPuntaje();
                }
            }

            System.out.println();
            System.out.println("=== RESULTADO DE LA RONDA ===");
            System.out.println("Puntos del Jugador: " + jugador.getPuntos());
            System.out.println("Puntos de la Casa: " + casa.getPuntos());

            // Condicionales anidados para definir el ganador
            if (jugador.getPuntos() > 21) {
                System.out.println("¡Te pasaste de 21! Has perdido esta ronda.");
            } else if (casa.getPuntos() > 21) {
                System.out.println("¡La Casa se pasó de 21! ¡Ganaste la ronda!");
            } else if (jugador.getPuntos() > casa.getPuntos()) {
                System.out.println("¡Felicidades! Superaste a la Casa. ¡Ganaste!");
            } else if (casa.getPuntos() > jugador.getPuntos()) {
                System.out.println("La Casa tiene mejor puntaje. Has perdido.");
            } else {
                System.out.println("¡Es un empate!");
            }

            // Guardar datos en la matriz de historial
            historialPartidas[partidaActual - 1][0] = jugador.getPuntos();
            historialPartidas[partidaActual - 1][1] = casa.getPuntos();

            partidaActual++;

            if (partidaActual <= 3) {
                System.out.println();
                System.out.println("¿Deseas jugar otra ronda? (S/N):");
                continuarPartidas = scanner.next();
            } else {
                System.out.println();
                System.out.println("Se ha alcanzado el límite máximo de 3 partidas en el historial.");
                continuarPartidas = "N";
            }
            System.out.println();
        }

        // Mostrar Resumen Global utilizando la Matriz
        System.out.println("=== RESUMEN GLOBAL DE PARTIDAS (MATRIZ) ===");
        System.out.println("Partida | Puntos Jugador | Puntos Casa");
        System.out.println("---------------------------------------");
        for (int i = 0; i < (partidaActual - 1); i++) {
            System.out.println("    " + (i + 1) + "    |        " + historialPartidas[i][0] + "        |      " + historialPartidas[i][1]);
        }

        System.out.println();
        System.out.println("Gracias por jugar. ¡Fin del programa!");
        scanner.close();
    }
}
