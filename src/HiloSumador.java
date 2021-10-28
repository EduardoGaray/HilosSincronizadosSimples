public class HiloSumador extends Thread {
    int contador;
    public HiloSumador(int numero){
        this.contador = numero;
    }

    public void run(){
        for (int n = 0; n <300; n++){
            contador++;
        }
        System.out.println("El valor del sumador es: " + contador);
    }

}
