package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        // CICLO WHILE
        var conteo = 0;
        while(conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++;
        }
        
        // CICLO DO WHILE
        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while(contador <= 7);

        // FOR que teniamos antes - el profe lo borro en la clase 1.4
        // lo dejo comentado para acordarme que existia
        /*
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);
            }
        }
        */

        // CLASE 1.4 - BREAK, CONTINUE Y ETIQUETAS LABELS
        // aca el profe cambio todo el codigo de arriba por estos dos for de abajo
        
        // ejemplo con break - corta el ciclo
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 == 0){
                System.out.println("contando = " + contando);
                break; // aca frena todo en el 0
            }
        }

        // ejemplo con etiquetas - OJO con esto
        // probamos poner "inicio:" en los dos for y no compila, tira error que ya existe
        // en el video primero lo puso arriba con break inicio y despues lo borro y lo puso aca
        // por eso ahora solo queda en este for
        inicio:
        for(var contando = 0; contando < 7; contando++){
            if(contando % 2 != 0){
                continue inicio; // se saltea los impares y sigue
            }
            System.out.println("contando = " + contando); // muestra 0,2,4,6
        }
    }
}