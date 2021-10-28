public class Main {
    public static void main(String[] args) {
        //Creo la variable que van a compartir
        Contador miContador = new Contador(100);
        //Creo el hilo que va a sumar y le paso la variable que debe sumar/restar
        HiloSumador miHiloSumador = new HiloSumador(miContador);
        HiloRestador miHiloRestador = new HiloRestador(miContador);
        //Pongo en marcha los hilos
        miHiloRestador.start();
        miHiloSumador.start();
        //Espero a que terminen los hilos
        while (miHiloSumador.isAlive() || miHiloRestador.isAlive()){

        }
    }
}
