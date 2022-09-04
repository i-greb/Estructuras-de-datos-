package ESTCDATOS;

public class complejidad {

    public float suma (float n) {
        long tiempoInicial = System.nanoTime();

        float suma = 0;
        for (float x = 1; x <= n + 1; x++) {
            suma += x;
        }
        long tiempoFinal = System.nanoTime();

        long tiempoTranscurrido = tiempoFinal - tiempoInicial;

        System.out.println("Tiempo transcurrido en nanosegundos:" + tiempoTranscurrido);
        System.out.println("Tiempo transcurrido en milisegundos:" + tiempoTranscurrido / 1000000);
        return suma;
    }

    public float sumagauss (float n){
        long tiempoInicial = System.nanoTime();

        float suma = (n * (n+1))/2;

        long tiempoFinal = System.nanoTime();

        long tiempoTranscurrido = tiempoFinal - tiempoInicial;

        System.out.println("Tiempo transcurrido en nanosegundos:" + tiempoTranscurrido);
        System.out.println("Tiempo transcurrido en milisegundos:" + tiempoTranscurrido / 1000000);
        return suma;

    }
}


