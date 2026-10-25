package ProyectoFinal;
public class Jugador {
    private int[] cartas;
    private int cantCartas;
    private int puntos;

    // Constructor
    public Jugador(int capacidadMaxima) {
        this.cartas = new int[capacidadMaxima];
        this.cantCartas = 0;
        this.puntos = 0;
    }

    public void agregarCarta(int carta) {
        if (cantCartas < cartas.length) {
            cartas[cantCartas] = carta;
            cantCartas++;
        }
    }

    public void calcularPuntaje() {
        int suma = 0;
        for (int i = 0; i < cantCartas; i++) {
            suma += cartas[i];
        }
        this.puntos = suma;
    }

    public void reiniciarMano() {
        cantCartas = 0;
        puntos = 0;
    }

    // Getters
    public int[] getCartas() {
        return cartas;
    }

    public int getCantCartas() {
        return cantCartas;
    }

    public int getPuntos() {
        return puntos;
    }
}